package com.ecommerce.order.dto;

import com.ecommerce.order.models.OrderStauts;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
public class OrderResponse {
    private Long id;
    private BigDecimal totalAmount;
    private OrderStauts stauts;
    private List<OrderItemDTO> items;
    private LocalDateTime createdAt;
}
