package com.laguna.menu.controller.dto;

import com.laguna.menu.entity.Food;

/**
 * The type Food dto.
 */
public record FoodDto(
    Long id,
    String name,
    String imageUrl,
    Integer price
) {

  /**
   * From entity food dto.
   *
   * @param food the food
   * @return the food dto
   */
  public static FoodDto fromEntity(Food food) {
    return new FoodDto(
        food.getId(),
        food.getName(),
        food.getImageUrl(),
        food.getPrice()
    );
  }
}
