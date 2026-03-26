package ru.yuyu.myshoppayment1;

import lombok.Builder;

import java.time.Instant;
import java.time.LocalDateTime;

@Builder
public record ProductResponseDto (
        Long PaymentId,
        Long productId,
        String name,
        Double price,
        Instant createdAt,
        String result
){
}
