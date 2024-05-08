package com.laguna.menu.repository;

import com.laguna.menu.entity.Drink;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * The interface Drink repository.
 */
public interface DrinkRepository extends JpaRepository<Drink, Long> {

}
