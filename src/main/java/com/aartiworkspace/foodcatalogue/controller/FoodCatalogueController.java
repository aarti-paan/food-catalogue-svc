package com.aartiworkspace.foodcatalogue.controller;

import com.aartiworkspace.foodcatalogue.dto.FoodCataloguePage;
import com.aartiworkspace.foodcatalogue.dto.FoodItemDTO;
import com.aartiworkspace.foodcatalogue.service.FoodCatalogueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/foodCatalogue")
@CrossOrigin
public class FoodCatalogueController {
    @Autowired
    FoodCatalogueService foodCatalogueService;

    @PostMapping(path="/addFootItem")
    public ResponseEntity<FoodItemDTO> addFoodItem(@RequestBody FoodItemDTO foodItemDTO){
       FoodItemDTO foodItemSaved =  foodCatalogueService.addFoodItem(foodItemDTO);
       return new ResponseEntity<>(foodItemSaved, HttpStatus.CREATED);
    }

    @GetMapping("/fetchRestaurantAndFootItemById/{restaurantId}")
    public ResponseEntity<FoodCataloguePage> fetchRestaurantDetailsWithFoodMenu(@PathVariable Integer restaurantId){
         FoodCataloguePage fetchFoodCataloguePage= foodCatalogueService.fetchFoodCataloguePage(restaurantId);
         return new ResponseEntity<>(fetchFoodCataloguePage, HttpStatus.OK);
    }

}
