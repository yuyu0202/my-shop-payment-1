package ru.yuyu.myshoppayment1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.concurrent.ThreadLocalRandom;

@Service
@Slf4j
public class PaymentService {
    public ProductResponseDto pay(ProductRequestDto productRequestDto) {
        String result = "payment_error";
        if (productRequestDto.paymentMethod().equals("CARD"))
            result = "success";
        log.info("Результат оплаты: {}", result);
       return ProductResponseDto.builder()
                .name(productRequestDto.name())
                .PaymentId(ThreadLocalRandom.current().nextLong(100))
                .price(productRequestDto.price())
                .result(result)
                .productId(productRequestDto.productId())
                .paymentDateTime(LocalDateTime.now())
                .build();
    }
}
