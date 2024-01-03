package com.agilemall.order.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentReqDetailDTO {
    private String paymentGbcd;
    private double paymentRate;
}
