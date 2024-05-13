package com.laguna.menu.service.exception;

public class DrinkNotFoundException extends NotFoundException {
  public DrinkNotFoundException() {
    super("Drink not found");
  }
}
