package com.newmanagement.MTIT05.CustomerFeedback.dto;

public class FeedbackRequest {

    private String customerName;
    private String customerItem;
    private  String customerFeedback;

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

    public String getCustomerFeedback() {
        return customerFeedback;
    }

    public void setCustomerFeedback(String customerFeedback) {
        this.customerFeedback = customerFeedback;
    }

    @Override
    public String toString() {
        return "FeedbackRequest{" +
                "customerName='" + customerName + '\'' +
                ", customerItem='" + customerItem + '\'' +
                ", customerFeedback='" + customerFeedback + '\'' +
                '}';
    }
}
