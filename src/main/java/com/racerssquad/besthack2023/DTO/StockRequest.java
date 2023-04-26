package com.racerssquad.besthack2023.DTO;

public class StockRequest {
    private String code;
    private String name;
    private String lastPrice;
    private String min;
    private String max;
    private String dateOfLastDeal;

    public StockRequest(String code, String name, String lastPrice, String min, String max, String dateOfLastDeal) {
        this.code = code;
        this.name = name;
        this.lastPrice = lastPrice;
        this.min = min;
        this.max = max;
        this.dateOfLastDeal = dateOfLastDeal;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastPrice() {
        return lastPrice;
    }

    public void setLastPrice(String lastPrice) {
        this.lastPrice = lastPrice;
    }

    public String getMin() {
        return min;
    }

    public void setMin(String min) {
        this.min = min;
    }

    public String getMax() {
        return max;
    }

    public void setMax(String max) {
        this.max = max;
    }

    public String getDateOfLastDeal() {
        return dateOfLastDeal;
    }

    public void setDateOfLastDeal(String dateOfLastDeal) {
        this.dateOfLastDeal = dateOfLastDeal;
    }
}
