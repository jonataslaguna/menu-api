package com.laguna.menu.service;

import com.laguna.menu.entity.Food;
import com.laguna.menu.repository.FoodRepository;
import com.laguna.menu.service.exception.FoodNotFoundException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The type Food service.
 */
@Service
public class FoodService  {
  private final FoodRepository foodRepository;
  @Autowired
  public FoodService(FoodRepository foodRepository) {
    this.foodRepository = foodRepository;
  }

  public List<Food> getAll() {
    return foodRepository.findAll();
  }

  public Food saveFood(Food food) {
    return foodRepository.save(food);
  }

  public Food findFoodById(Long id) throws FoodNotFoundException {
    return foodRepository.findById(id)
        .orElseThrow(FoodNotFoundException::new);
  }

  public void deleteFood(Food food) {
    foodRepository.delete(food);
  }
}
