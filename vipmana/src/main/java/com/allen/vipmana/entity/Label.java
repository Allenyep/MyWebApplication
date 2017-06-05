package com.allen.vipmana.entity;

/**
 * Created by allen on 2017/6/5.
 */
public class Label {
    private int labelId;
    private int userId;
    private int labelColorId;
    private String labelName;

    public int getLabelId() {
        return labelId;
    }

    public void setLabelId(int labelId) {
        this.labelId = labelId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getLabelColorId() {
        return labelColorId;
    }

    public void setLabelColorId(int labelColorId) {
        this.labelColorId = labelColorId;
    }

    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }
}
