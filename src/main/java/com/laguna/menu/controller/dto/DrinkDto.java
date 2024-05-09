package com.laguna.menu.controller.dto;

import com.laguna.menu.entity.Food;

/**
 * The type Drink dto.
 */
public record DrinkDto(
    Long id,
    String name,
    String imageUrl,
    Double price
) {

  /**
   * From entity drink dto.
   *
   * @param food the food
   * @return the drink dto
   */
  public static DrinkDto fromEntity(Food food) {
    return new DrinkDto(
        food.getId(),
        food.getName(),
        food.getImageUrl(),
        food.getPrice()
    );
  }
}
