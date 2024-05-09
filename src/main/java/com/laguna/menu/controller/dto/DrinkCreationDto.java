package com.laguna.menu.controller.dto;

import com.laguna.menu.entity.Drink;

/**
 * The type Drink creation dto.
 */
public record DrinkCreationDto(
    String name,
    String imageUrl,
    Double price
) {
  public Drink toEntity() {
    return new Drink(name, imageUrl, price);
  }
}
