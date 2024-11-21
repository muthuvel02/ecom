package com.muthu.ecommerce.modal;

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
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    @OneToOne
    private User user;
    @OneToMany(mappedBy = "cart", cascade = CascadeType.ALL, orphanRemoval = true ) // cascade we are using it because what ever changes we are make the cart it will directly reflect here as well
    private Set<CartItem> cartItems = new HashSet<>();// orphanRemoval when ever we are removing any it will reflect to the cart as well

    private double totalSellingPrice;

    private  int totalItem;

    private int totalMrpPrice;

    private int discount;

    private String couponCode;
}
