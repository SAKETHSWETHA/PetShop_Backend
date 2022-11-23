package com.project.PetShop.Repo;


import com.project.PetShop.Bean.petsBean;
import com.project.PetShop.Bean.petsBehaviourBean;
import com.project.PetShop.Bean.petsFoodBean;
import com.project.PetShop.Entity.petsBehaviourEntity;
import com.project.PetShop.Entity.petsEntity;
import com.project.PetShop.Entity.petsFoodEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class petsRepository {
    @Autowired
    private petsRepo petsRepo;
    @Autowired
    private petsBehaviourRepo petsBehaviourRepo;
    @Autowired
    private petsFoodRepo petsFoodRepo;

    public List<petsBean> retrievePets() {
        List<petsBean> petsBeanList = new ArrayList<petsBean>();
        List<petsEntity> petsEntityList = petsRepo.findAll();

        for (petsEntity p : petsEntityList) {
            petsBean petsBean = new petsBean();
            petsBean.setId(p.getId());
            petsBean.setname(p.getname());
            petsBean.setprice(p.getprice());
            petsBean.setImage(p.getImage());
            petsBean.setinStock(p.getinStock());
            petsBean.setfastDelivery(p.getfastDelivery());
            petsBean.setRatings(p.getRatings());
            petsBeanList.add(petsBean);
        }
        return petsBeanList;
    }

    public List<petsBehaviourBean> retrievePetsBehaviour(){
        List<petsBehaviourBean> petsBehaviourBeanList = new ArrayList<petsBehaviourBean>();
        List<petsBehaviourEntity> petsBehaviourEntityList = petsBehaviourRepo.findAll();
        for (petsBehaviourEntity p : petsBehaviourEntityList){
            petsBehaviourBean petsBehaviourBean = new petsBehaviourBean();
            petsBehaviourBean.setId(p.getId());
            petsBehaviourBean.setname(p.getname());
            petsBehaviourBean.setprice(p.getprice());
            petsBehaviourBean.setImage(p.getImage());
            petsBehaviourBean.setinStock(p.getinStock());
            petsBehaviourBean.setfastDelivery(p.getfastDelivery());
            petsBehaviourBean.setRatings(p.getRatings());
            petsBehaviourBeanList.add(petsBehaviourBean);
        }
      return petsBehaviourBeanList;
    }


    public List<petsFoodBean> retrievePetsFood(){
        List<petsFoodBean> petsFoodBeanList = new ArrayList<petsFoodBean>();
        List<petsFoodEntity> petsFoodEntityList = petsFoodRepo.findAll();
        for(petsFoodEntity p : petsFoodEntityList){
            petsFoodBean petsFoodBean = new petsFoodBean();
            petsFoodBean.setId(p.getId());
            petsFoodBean.setname(p.getname());
            petsFoodBean.setprice(p.getprice());
            petsFoodBean.setImage(p.getImage());
            petsFoodBean.setinStock(p.getinStock());
            petsFoodBean.setfastDelivery(p.getfastDelivery());
            petsFoodBean.setRatings(p.getRatings());
            petsFoodBeanList.add(petsFoodBean);
            //Using BeanUtils method -> leftside=Item to be copied and rightside=It should be copied into
//            BeanUtils.copyProperties(p,petsFoodBean);
//            petsFoodBeanList.add(petsFoodBean);
        }
        return petsFoodBeanList;
    }

//    public int uploadPets(petsBean petsbean) {
//        petsEntity petsEntity = new petsEntity();
//
////        petsEntity.setPetname(petsbean.getPetname());
////        petsEntity.setPetprice(petsbean.getPetprice());
//        BeanUtils.copyProperties(petsbean,petsEntity);
//        // petsRepo.save will return an object which is pets_entity and we are storing it in pets1 object.
//        // pets1!=petsEntity because pets1 will also contain ID also. After saving in DB it will create an ID and returns it where as pets_entity won't have that ID
//         petsEntity pets1 = petsRepo.save(petsEntity);
//
//        return pets1.getId();
//    }
//
//    public void deletePets(Integer id) {
//        petsRepo.deleteById(id);
//    }
}
