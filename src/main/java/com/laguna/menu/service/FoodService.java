package com.laguna.menu.service;

import com.laguna.menu.entity.Food;
import com.laguna.menu.repository.FoodRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class FoodService  {
  private final FoodRepository foodRepository;

  public FoodService(FoodRepository foodRepository) {
    this.foodRepository = foodRepository;
  }

  public List<Food> getAll(){
    return foodRepository.findAll();
  }
}
