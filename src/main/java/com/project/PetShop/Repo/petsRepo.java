package com.project.PetShop.Repo;

import com.project.PetShop.Entity.petsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface petsRepo extends JpaRepository<petsEntity,Integer> {

}
