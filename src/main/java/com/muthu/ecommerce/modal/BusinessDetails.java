package com.muthu.ecommerce.modal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BusinessDetails {

    private String businessName;

    private String businessEmail;
    private String businessMobile;
    private String businessAddress;
    private String logo;
    private String banner;


}
