package com.muthu.ecommerce.modal;

import com.muthu.ecommerce.domain.OrderStatus;
import com.muthu.ecommerce.domain.PaymentStatus;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

     private String orderId;

     @ManyToOne
     private User user;

     private Long sellerId;

     @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true)
     private List<OrderItem> orderItems = new ArrayList<>();

     @ManyToOne
     private Address shippingAddress;

     @Embedded
    private PaymentDetails paymentDetails = new PaymentDetails();


     private double totalMrpPrice;

     private Integer totalSellingPrice;

     private Integer discount;

     private OrderStatus orderStatus;

     private int totalItem;

     private PaymentStatus paymentStatus = PaymentStatus.PENDING;

     private LocalDateTime orderDate = LocalDateTime.now();

     private LocalDateTime deliverData = orderDate.plusDays(7);


}
