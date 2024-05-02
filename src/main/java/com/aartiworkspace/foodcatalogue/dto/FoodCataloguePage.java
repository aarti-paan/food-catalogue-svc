package com.aartiworkspace.foodcatalogue.dto;

import com.aartiworkspace.foodcatalogue.entity.FoodItem;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FoodCataloguePage {


    List<FoodItem> foodItemsList;
    private Restaurant restaurant;
}
