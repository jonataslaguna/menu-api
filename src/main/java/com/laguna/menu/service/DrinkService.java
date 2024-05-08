package com.laguna.menu.service;

import com.laguna.menu.entity.Drink;
import com.laguna.menu.repository.DrinkRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The type Drink service.
 */
@Service
public class DrinkService {
  private final DrinkRepository drinkRepository;

  @Autowired
  public DrinkService(DrinkRepository drinkRepository) {
    this.drinkRepository = drinkRepository;
  }

  public List<Drink> getAll() {
    return drinkRepository.findAll();
  }

  public Drink saveDrink(Drink newDrink) {
    return drinkRepository.save(newDrink);
  }
}
