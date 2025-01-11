package com.Erp.PurchaseOrderService.Dto;

import com.Erp.PurchaseOrderService.Model.PurchaseOrder;

import java.util.List;

public class ResponseDto {

    private PurchaseOrder purchaseOrder;
    private List<ProjectDto> projectDto;

    public ResponseDto(PurchaseOrder purchaseOrder, List<ProjectDto> projectDto) {
        this.purchaseOrder = purchaseOrder;
        this.projectDto = projectDto;
    }

    public ResponseDto() {
    }

    public PurchaseOrder getPurchaseOrder() {
        return purchaseOrder;
    }

    public void setPurchaseOrder(PurchaseOrder purchaseOrder) {
        this.purchaseOrder = purchaseOrder;
    }

    public List<ProjectDto> getProjectDto() {
        return projectDto;
    }

    public void setProjectDto(List<ProjectDto> projectDto) {
        this.projectDto = projectDto;
    }


}
