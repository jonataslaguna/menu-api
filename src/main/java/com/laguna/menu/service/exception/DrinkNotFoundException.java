package com.laguna.menu.service.exception;

public class DrinkNotFoundException extends NotFoundException {
  public DrinkNotFoundException(String message) {
    super("Drink not found");
  }
}
