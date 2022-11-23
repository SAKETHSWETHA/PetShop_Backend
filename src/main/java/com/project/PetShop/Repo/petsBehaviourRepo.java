package com.project.PetShop.Repo;

import com.project.PetShop.Entity.petsBehaviourEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface petsBehaviourRepo extends JpaRepository<petsBehaviourEntity,Integer> {

}
