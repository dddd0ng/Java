package com.swcamp.springdatajpa.menu.repository;


import com.swcamp.springdatajpa.menu.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//인터페이스는 객체가 될 수 없어서 bean상태로 못만듦
//extends JpaRepository 사용해야 bean
//의존성 주입 가능해짐, 객체가 될 수 있음
public interface MenuRepository extends JpaRepository<Menu, Integer> {
    List<Menu> findByMenuPriceGreaterThan(int menuPrice);

    List<Menu> findByMenuPriceBetween(int menuPrice, int i);
}
