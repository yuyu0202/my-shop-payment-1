package ru.yuyu.myshoppayment1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PaymentService {

   private final PaymentRepository paymentRepository;
   private final PaymentMapper paymentMapper;

    public PaymentService(PaymentRepository paymentRepository, PaymentMapper paymentMapper) {
        this.paymentRepository = paymentRepository;
        this.paymentMapper = paymentMapper;

    }

     public ProductResponseDto pay(ProductRequestDto productRequestDto) {
        String result = "payment_error";
        if (productRequestDto.paymentMethod().equals("CARD"))
            result = "success";
        log.info("Результат оплаты: {}", result);

        Payment paymentToSave = paymentMapper.toPayment(productRequestDto);
        paymentToSave.setResult(result);
        paymentRepository.save(paymentToSave);
        return paymentMapper.toDto(paymentToSave);
    }

}
