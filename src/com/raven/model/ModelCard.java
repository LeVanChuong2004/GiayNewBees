package com.raven.model;

import javax.swing.Icon;

public class ModelCard {

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getValues() {
        return values;
    }

    public void setValues(int values) {
        this.values = values;
    }

    public String getPercentage() {
        return thongke;
    }

    public void setPercentage(String thongke) {
        this.thongke = thongke;
    }

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public ModelCard(String title, int values, String thongke, Icon icon) {
        this.title = title;
        this.values = values;
        this.thongke = thongke;
        this.icon = icon;
    }

    public ModelCard() {
    }

    private String title;
    private int values;
    private String thongke;
    private Icon icon;
}
