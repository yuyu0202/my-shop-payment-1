package ru.yuyu.myshoppayment1;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

@Mapper(
        componentModel = MappingConstants.ComponentModel.SPRING,
        unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface PaymentMapper {
    @Mapping(source = "id", target = "productId")
    ProductResponseDto toDto(Payment payment);
    Payment toPayment(ProductResponseDto dto);

    Payment toPayment(ProductRequestDto dto);
}
