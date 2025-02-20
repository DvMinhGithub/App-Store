package com.mdv.appstore.model.dto;

import com.mdv.appstore.enums.OrderStatus;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderDTO {
    private Long id;
    private String orderCode;
    private String address;
    private String phone;
    private OrderStatus status;
    private Double totalPrice;
    private String voucherCode;
    private Long userId;

    private List<OrderItemDTO> orderItems;
    private List<OrderHistoryDTO> orderHistories;
}
