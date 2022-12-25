package com.springbootacademy.pointofsale.repository;

import com.springbootacademy.pointofsale.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface ItemRepository extends JpaRepository<Item,Integer> {
}
