package com.newmanagement.MTIT05.CustomerFeedback.dto;

public class CreateUserRequest {
    private String customerName;
    private String customerItem;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerItem() {
        return customerItem;
    }

    public void setCustomerItem(String customerItem) {
        this.customerItem = customerItem;
    }
}

