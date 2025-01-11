package com.Erp.PurchaseOrderService.Service;

import com.Erp.PurchaseOrderService.Dto.ProjectDto;
import com.Erp.PurchaseOrderService.Dto.PurchaseOrderDto;
import com.Erp.PurchaseOrderService.Dto.ResponseDto;
import com.Erp.PurchaseOrderService.Model.PurchaseOrder;
import com.Erp.PurchaseOrderService.Repository.PurchaseOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;
import java.util.Optional;

@Service
public class PurchaseOrderService {

    @Autowired
    private PurchaseOrderRepository purchaseOrderRepository;

    @Autowired
    private WebClient webClient;

    // Save PurchaseOrder
    public PurchaseOrder savePurchaseOrder(PurchaseOrder purchaseOrder) {
        return purchaseOrderRepository.save(purchaseOrder);
    }

    // Get PurchaseOrder by purchaseId
    public Optional<PurchaseOrder> getPurchaseOrderById(String purchaseId) {
        return purchaseOrderRepository.findById(purchaseId);
    }

    // Get all PurchaseOrders
    public Iterable<PurchaseOrder> getAllPurchaseOrders() {
        return purchaseOrderRepository.findAll();
    }


    public ResponseDto getBooking(int bookingNumber) {
        ResponseDto responseDto = new ResponseDto();
        PurchaseOrder bookingModel = purchaseOrderRepository.findByBookingNumber(bookingNumber)
                .orElseThrow(() -> new RuntimeException("Airline not found"));
        PurchaseOrderDto bookingDto = mapToBooking(bookingModel);

        // Fetch drivers for the booking
        List<ProjectDto> driverDTOList = webClientBuilder.baseUrl("http://localhost:9098")
                .build()
                .get()
                .uri("/projects/" + bookingModel.getBookingNumber())
                .retrieve()
                .bodyToMono(new ParameterizedTypeReference<List<DriverDto>>() {})
                .block();

        // Fetch customers for each driver
        for (DriverDto driverDTO : driverDTOList) {
            List<CustomerDto> customerDTOList = webClientBuilder.baseUrl("http://localhost:9097")
                    .build()
                    .get()
                    .uri("/customer/" + driverDTO.getVehcileNumber())
                    .retrieve()
                    .bodyToMono(new ParameterizedTypeReference<List<CustomerDto>>() {})
                    .block();

            driverDTO.setCustomerDto(customerDTOList);
        }

        responseDto.setBooking(bookingDto);
        responseDto.setDriver(driverDTOList);

        return responseDto;
    }

    private BookingDto mapToBooking(BookingModel booking) {
        BookingDto dto = new BookingDto();
        dto.setBookingId(booking.getBookingId());
        dto.setBookingNumber(booking.getBookingNumber());
        dto.setFare(booking.getFare());
        dto.setStatus(booking.getStatus());
        return dto;
    }


    @Override
    public BookingModel addBooking(BookingModel bookingModel) {
        return repo.save(bookingModel);
    }
}
