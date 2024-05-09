package com.laguna.menu.controller.dto;

import com.laguna.menu.entity.Drink;
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
   * @param drink the drink
   * @return the drink dto
   */
  public static DrinkDto fromEntity(Drink drink) {
    return new DrinkDto(
        drink.getId(),
        drink.getName(),
        drink.getImageUrl(),
        drink.getPrice()
    );
  }
}
