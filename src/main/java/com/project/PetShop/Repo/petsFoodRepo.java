package com.project.PetShop.Repo;

import com.project.PetShop.Entity.petsFoodEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface petsFoodRepo extends JpaRepository<petsFoodEntity,Integer> {

}
