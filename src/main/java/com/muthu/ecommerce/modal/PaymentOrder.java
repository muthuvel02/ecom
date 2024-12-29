package com.muthu.ecommerce.modal;

import com.muthu.ecommerce.domain.PaymentOrderStatus;
import com.muthu.ecommerce.domain.paymentMethod;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class PaymentOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private PaymentOrderStatus status = PaymentOrderStatus.PENDING;

    private paymentMethod paymentMethod;

    private String paymentLinkId;

    @ManyToOne
    private User user;

    @OneToMany
    private Set<Order> orders = new HashSet<>();

}
