package com.Erp.PurchaseOrderService.Controller;

import com.Erp.PurchaseOrderService.Dto.ResponseDto;
import com.Erp.PurchaseOrderService.Model.PurchaseOrder;
import com.Erp.PurchaseOrderService.Service.PurchaseOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/purchaseorder")
public class PurchaseOrderController {

    @Autowired
    private PurchaseOrderService purchaseOrderService;


    // Create a new PurchaseOrder
    @PostMapping
    public PurchaseOrder createPurchaseOrder(@RequestBody PurchaseOrder purchaseOrder) {
        return purchaseOrderService.savePurchaseOrder(purchaseOrder);
    }

    // Get PurchaseOrder by purchaseId
    @GetMapping("/{purchaseId}")
    public PurchaseOrder getPurchaseOrderById(@PathVariable String purchaseId) {
        Optional<PurchaseOrder> purchaseOrder = purchaseOrderService.getPurchaseOrderById(purchaseId);
        return purchaseOrder.orElse(null);  // Return null if not found
    }

    // Get all PurchaseOrders
    @GetMapping
    public Iterable<PurchaseOrder> getAllPurchaseOrders() {
        return purchaseOrderService.getAllPurchaseOrders();
    }

    @GetMapping("{bookingNumber}")
    public ResponseEntity<ResponseDto> getCustomer(@PathVariable("bookingNumber")int bookingNumber)
    {
        ResponseDto responseDto = purchaseOrderService.getBooking(bookingNumber);
        return ResponseEntity.ok(responseDto);
    }

}
