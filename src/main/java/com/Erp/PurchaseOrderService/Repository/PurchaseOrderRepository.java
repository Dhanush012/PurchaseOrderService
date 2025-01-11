package com.Erp.PurchaseOrderService.Repository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.Erp.PurchaseOrderService.Model.PurchaseOrder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBScanExpression;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class PurchaseOrderRepository {

    private final DynamoDBMapper dynamoDBMapper;

    @Autowired
    public PurchaseOrderRepository(DynamoDBMapper dynamoDBMapper) {
        this.dynamoDBMapper = dynamoDBMapper;
    }

    // Save PurchaseOrder
    public PurchaseOrder save(PurchaseOrder purchaseOrder) {
        dynamoDBMapper.save(purchaseOrder);
        return purchaseOrder;
    }

    // Get PurchaseOrder by purchaseId
    public Optional<PurchaseOrder> findById(String purchaseId) {
        PurchaseOrder purchaseOrder = dynamoDBMapper.load(PurchaseOrder.class, purchaseId);
        return Optional.ofNullable(purchaseOrder);
    }

    // Get all PurchaseOrders
    public Iterable<PurchaseOrder> findAll() {
        return dynamoDBMapper.scan(PurchaseOrder.class, new DynamoDBScanExpression());
    }
}
