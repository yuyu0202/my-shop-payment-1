package ru.yuyu.myshoppayment1;

import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public record ProductResponseDto (
        Long PaymentId,
        Long productId,
        String name,
        Double price,
        LocalDateTime paymentDateTime,
        String result
){
}
