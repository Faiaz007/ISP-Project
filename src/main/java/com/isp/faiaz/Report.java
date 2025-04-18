package com.isp.faiaz;

import java.io.Serializable;

public class Report implements Serializable {
    private String type;
    private String description;

    public Report(String type, String description) {
        this.type = type;
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Report{" +
                "type='" + type + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
