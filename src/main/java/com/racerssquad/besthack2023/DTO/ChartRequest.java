package com.racerssquad.besthack2023.DTO;

public class ChartRequest {
    private String stock;
    private String chartType;

    @Override
    public String toString() {
        return "ChartRequest{" +
                "stock='" + stock + '\'' +
                ", chartType='" + chartType + '\'' +
                '}';
    }

    public String getStock() {
        return stock;
    }

    public String getChartType() {
        return chartType;
    }
}
