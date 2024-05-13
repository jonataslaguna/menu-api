package com.laguna.menu.service.exception;

/**
 * The type Food not found exception.
 */
public class FoodNotFoundException extends NotFoundException {
  public FoodNotFoundException() {
    super("Food not found");
  }
}
