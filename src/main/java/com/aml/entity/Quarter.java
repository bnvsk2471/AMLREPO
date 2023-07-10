package com.aml.entity;

import java.time.LocalDate;

public class Quarter {
    private int quarter;
    private LocalDate startDate;

    public Quarter(int quarter) {
        this.quarter = quarter;
      //  this.startDate = startDate;
    }

    public int getQuarter() {
        return quarter;
    }

    public LocalDate getStartDate() {
        return startDate;
    }
}
