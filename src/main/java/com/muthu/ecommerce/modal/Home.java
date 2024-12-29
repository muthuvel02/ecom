package com.muthu.ecommerce.modal;

import com.muthu.ecommerce.domain.HomeCategorySection;
import lombok.Data;

import java.util.List;

@Data
public class Home {

    private List<HomeCategory> grid;

    private List<HomeCategory> shopByCategories;

    private List<HomeCategory> electricCategories;

    private List<HomeCategory> dealCategories;

    private List<Deal> deals;

}
