package com.project.PetShop.Service;

import com.project.PetShop.Bean.petsBean;
import com.project.PetShop.Bean.petsBehaviourBean;
import com.project.PetShop.Bean.petsFoodBean;
import com.project.PetShop.Repo.petsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class petShopService {
    @Autowired
    private petsRepository petsRepository;

    public List<petsBean> retrievePets() {
        return petsRepository.retrievePets();
    }

    public List<petsBehaviourBean> retrievePetsBehaviour(){
        return petsRepository.retrievePetsBehaviour();
    }
    public List<petsFoodBean> retrievePetsFood(){
        return petsRepository.retrievePetsFood();
    }

//    public int uploadPets(petsBean petsbean) {
//        int i = petsRepository.uploadPets(petsbean);
//       return i;
//    }
//
//    public void deletePets(Integer id) {
//       petsRepository.deletePets(id);
//    }
}
