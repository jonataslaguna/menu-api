package com.laguna.menu.controller;

import com.laguna.menu.controller.dto.DrinkCreationDto;
import com.laguna.menu.controller.dto.DrinkDto;
import com.laguna.menu.entity.Drink;
import com.laguna.menu.service.DrinkService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/drink")
public class DrinkController {
  private final DrinkService drinkService;
  @Autowired
  public DrinkController(DrinkService drinkService) {
    this.drinkService = drinkService;
  }

  @CrossOrigin(origins = "*", allowedHeaders = "*")
  @GetMapping
  public List<DrinkDto> getAll() {
    List<Drink> drinks = drinkService.getAll();
    return drinks.stream()
        .map(DrinkDto::fromEntity)
        .toList();
  }
  @CrossOrigin(origins = "*", allowedHeaders = "*")
  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public DrinkDto saveDrink(@RequestBody DrinkCreationDto newDrink) {
    return DrinkDto.fromEntity(
        drinkService.saveDrink(newDrink.toEntity())
    );
  }
}
