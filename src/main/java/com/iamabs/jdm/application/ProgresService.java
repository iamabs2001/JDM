package com.iamabs.jdm.application;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

class ProgresService extends JProgressBar implements TableCellRenderer {

    public ProgresService(int min, int max) {
        super(min, max);
    }

    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        setValue((int) ((Float) value).floatValue());
        return this;
    }
}
