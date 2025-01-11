package com.Erp.PurchaseOrderService.Model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName = "PurchaseOrder")  // Replace with your actual DynamoDB table name
public class PurchaseOrder {

    @DynamoDBHashKey(attributeName = "purchaseId") // Primary key
    private String purchaseId; // Unique identifier for the purchase order

    @DynamoDBAttribute(attributeName = "clientName")
    private String clientName; // Name of the client placing the order

    @DynamoDBAttribute(attributeName = "orderDate")
    private String orderDate; // Date when the order was placed (ISO date string)

    @DynamoDBAttribute(attributeName = "deliveryDate")
    private String deliveryDate; // Expected delivery date (ISO date string)

    @DynamoDBAttribute(attributeName = "totalAmount")
    private Double totalAmount; // Total cost of the order

    @DynamoDBAttribute(attributeName = "paymentStatus")
    private String paymentStatus; // Status of the payment (e.g., "Paid", "Pending")

    @DynamoDBAttribute(attributeName = "accountNumber")
    private String accountNumber; // Account number for payment

    @DynamoDBAttribute(attributeName = "ifscCode")
    private String ifscCode; // IFSC code for the payment account (if applicable)

    @DynamoDBAttribute(attributeName = "bookingNumber")
    private int bookingNumber;
    // Getters and Setters


    public int getBookingNumber() {
        return bookingNumber;
    }

    public void setBookingNumber(int bookingNumber) {
        this.bookingNumber = bookingNumber;
    }

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

    public PurchaseOrder(String purchaseId, String clientName, String orderDate, String deliveryDate, Double totalAmount, String paymentStatus, String accountNumber, String ifscCode, int bookingNumber) {
        this.purchaseId = purchaseId;
        this.clientName = clientName;
        this.orderDate = orderDate;
        this.deliveryDate = deliveryDate;
        this.totalAmount = totalAmount;
        this.paymentStatus = paymentStatus;
        this.accountNumber = accountNumber;
        this.ifscCode = ifscCode;
        this.bookingNumber = bookingNumber;
    }

    public PurchaseOrder() {
    }
}
