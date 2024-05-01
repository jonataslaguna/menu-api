package com.laguna.menu.service.exception;

/**
 * The type Food not found exception.
 */
public class FoodNotFoundException extends NotFoundException {
  public FoodNotFoundException(String message) {
    super("Food not found");
  }
}
