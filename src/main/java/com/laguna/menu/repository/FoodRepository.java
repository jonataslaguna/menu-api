package com.laguna.menu.repository;

import com.laguna.menu.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * The interface Food repository.
 */
public interface FoodRepository extends JpaRepository<Food, Long> {

}
