package com.Erp.PurchaseOrderService.Dto;

public class PurchaseOrderDto {

    private String purchaseId;
    private String clientName;
    private String orderDate;
    private String deliveryDate;
    private Double totalAmount;
    private String paymentStatus;
    private String accountNumber;
    private String ifscCode;

    // Getters and Setters

    public String getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(String purchaseId) {
        this.purchaseId = purchaseId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }

    // Constructors

    public PurchaseOrderDto(String purchaseId, String clientName, String orderDate, String deliveryDate,
                            Double totalAmount, String paymentStatus, String accountNumber, String ifscCode) {
        this.purchaseId = purchaseId;
        this.clientName = clientName;
        this.orderDate = orderDate;
        this.deliveryDate = deliveryDate;
        this.totalAmount = totalAmount;
        this.paymentStatus = paymentStatus;
        this.accountNumber = accountNumber;
        this.ifscCode = ifscCode;
    }

    public PurchaseOrderDto() {
    }
}

