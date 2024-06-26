package com.laguna.menu.controller;

import com.laguna.menu.controller.dto.FoodCreationDto;
import com.laguna.menu.controller.dto.FoodDto;
import com.laguna.menu.entity.Food;
import com.laguna.menu.service.FoodService;
import com.laguna.menu.service.exception.FoodNotFoundException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * The type Food controller.
 */
@RestController
@RequestMapping("/food")
public class FoodController {

  private final FoodService foodService;

  @Autowired
  public FoodController(FoodService foodService) {
    this.foodService = foodService;
  }

  /**
   * Gets all.
   *
   * @return the all
   */
  @CrossOrigin(origins = "*", allowedHeaders = "*")
  @GetMapping
  public List<FoodDto> getAll() {
    List<Food> foods = foodService.getAll();
    return foods.stream()
        .map(FoodDto::fromEntity)
        .toList();
  }

  /**
   * Save food.
   *
   * @param newFood the new food
   * @return the food dto
   */
  @CrossOrigin(origins = "*", allowedHeaders = "*")
  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public FoodDto saveFood(@RequestBody FoodCreationDto newFood) {
    return FoodDto.fromEntity(
        foodService.saveFood(newFood.toEntity())
    );
  }

  @DeleteMapping("/{id}")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public void deleteFood(@PathVariable Long id) throws FoodNotFoundException {
    Food foodToDelete = foodService.findFoodById(id);
    foodService.deleteFood(foodToDelete);
  }
}
