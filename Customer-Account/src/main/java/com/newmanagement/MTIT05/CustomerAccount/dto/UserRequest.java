package com.newmanagement.MTIT05.CustomerAccount.dto;

public class UserRequest {
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

    @Override
    public String toString() {
        return "UserRequest{" +
                "customerName='" + customerName + '\'' +
                ", customerItem='" + customerItem + '\'' +
                '}';
    }
}
