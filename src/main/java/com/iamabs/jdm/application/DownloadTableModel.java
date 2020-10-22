package com.iamabs.jdm.application;

import java.util.*;
import javax.swing.*;
import javax.swing.table.*;

class DownloadTableModel extends AbstractTableModel implements Observer {

    private static final String[] TableColumns = {"File", "Progress", "Size MB", "Speed KBPS", "Status", "Elapsed Time", "Time Left"};
    private static final Class[] TableColumnsDataType = {String.class, JProgressBar.class, String.class, String.class, String.class, String.class, String.class};
    private ArrayList<DownloaderService> downloadList = new ArrayList<DownloaderService>();

    public void addDownload(DownloaderService download) {
        download.addObserver(this);
        downloadList.add(download);
        fireTableRowsInserted(getRowCount() - 1, getRowCount() - 1);
    }

    public DownloaderService getDownload(int row) {
        return downloadList.get(row);
    }

    public void clearDownload(int row) {
        downloadList.remove(row);
        fireTableRowsDeleted(row, row);
    }

    public int getColumnCount() {
        return TableColumns.length;
    }

    public String getColumnName(int col) {
        return TableColumns[col];
    }

    public Class getColumnClass(int col) {
        return TableColumnsDataType[col];
    }

    public int getRowCount() {
        return downloadList.size();
    }

    public Object getValueAt(int row, int col) {

        DownloaderService download = downloadList.get(row);
        switch (col) {
            case 0:
                return download.getUrl();
            case 1:
                return new Float(download.getProgress());
            case 2:
                long size = download.getSize();
                return (size == -1) ? "" : Float.toString((float) size / 1048576);
            case 3:
                return download.getSpeed();
            case 4:
                return DownloaderService.STATUSES[download.getStatus()];
            case 5:
                return download.getElapsedTime();
            case 6:
                return download.getRemainingTime();
        }
        return "";
    }

    public void update(Observable o, Object arg) {
        int index = downloadList.indexOf(o);
        fireTableRowsUpdated(index, index);
    }
}
