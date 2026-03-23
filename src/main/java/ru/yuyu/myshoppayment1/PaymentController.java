package ru.yuyu.myshoppayment1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api")
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/pay")
    public ProductResponseDto payment(@RequestBody ProductRequestDto productRequestDto) {
        log.info("Пришел запрос на оплату товара: {}", productRequestDto.name());
         return paymentService.pay(productRequestDto);
    }
}
