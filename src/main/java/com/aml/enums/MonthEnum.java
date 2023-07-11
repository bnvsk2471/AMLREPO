package com.aml.enums;

public enum MonthEnum {
    JANUARY("Q4"),
    FEBRUARY("Q4"),
    MARCH("Q4"),
    APRIL("Q1"),
    MAY("Q1"),
    JUNE("Q1"),
    JULY("Q2"),
    AUGUST("Q2"),
    SEPTEMBER("Q2"),
    OCTOBER("Q3"),
    NOVEMBER("Q3"),
    DECEMBER("Q3"), month;

    private final String value;

    MonthEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
