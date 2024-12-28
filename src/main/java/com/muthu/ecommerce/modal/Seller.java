package com.muthu.ecommerce.modal;

import com.muthu.ecommerce.domain.AccountStatus;
import com.muthu.ecommerce.domain.USER_ROLE;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Seller {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    private String sellerName;

    private String mobile;
    @Column(unique = true, nullable = false)
    private String email;

    private String password;
    @Embedded
    private BusinessDetails businessDetails = new BusinessDetails();
    @Embedded
    private BankDetails bankDetails = new BankDetails();
    @OneToOne
    private Address pickupAddress = new Address();

    private String GSTIN;

    private USER_ROLE role = USER_ROLE.ROLE_SELLER;

    private AccountStatus accountStatus = AccountStatus.PENDING_VERIFICATION;



}
