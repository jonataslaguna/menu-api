package com.laguna.menu.controller;

import com.laguna.menu.entity.Food;
import com.laguna.menu.service.FoodService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/food")
public class FoodController {
  private final FoodService foodService;

  public FoodController(FoodService foodService) {
    this.foodService = foodService;
  }

  @GetMapping
  public List<Food> getAll() {
    return foodService.getAll();
  }
}
