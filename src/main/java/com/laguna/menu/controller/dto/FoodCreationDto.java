package com.laguna.menu.controller.dto;

import com.laguna.menu.entity.Food;

/**
 * The type Food creation dto.
 */
public record FoodCreationDto(
    String name,
    String imageUrl,
    Double price
) {
  public Food toEntity() {
    return new Food(name, imageUrl, price);
  }
}
