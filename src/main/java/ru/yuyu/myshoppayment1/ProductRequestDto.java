package ru.yuyu.myshoppayment1;


public record ProductRequestDto(
        Long productId,
        String name,
        Double price,
        String paymentMethod
) {
}
