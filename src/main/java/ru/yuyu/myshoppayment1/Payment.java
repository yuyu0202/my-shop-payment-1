package ru.yuyu.myshoppayment1;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.time.LocalDateTime;

@Entity
@Table(name = "payment")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "product_id")
    private Long productId;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private Double price;

    @Column(name = "payment_method")
    private String paymentMethod;

    @Column(name = "created_at")
    private Instant createdAt;

    @Column(name = "result")
    private String result;

    @PrePersist
    public void prePersist() {
        this.createdAt = Instant.now();
    }

}
