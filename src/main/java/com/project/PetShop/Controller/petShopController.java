package com.project.PetShop.Controller;


import com.project.PetShop.Bean.petsBean;
import com.project.PetShop.Bean.petsBehaviourBean;
import com.project.PetShop.Bean.petsFoodBean;
import com.project.PetShop.Entity.petsEntity;
import com.project.PetShop.Repo.petsRepo;
import com.project.PetShop.Service.petShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


import java.util.List;
@CrossOrigin(origins = "*", maxAge = 4800)
@RestController

public class petShopController {
  @Autowired
  private petShopService petShopService;
  private final petsRepo petsRepo;

  public petShopController(com.project.PetShop.Repo.petsRepo petsRepo) {
    this.petsRepo = petsRepo;
  }

  @RequestMapping(value = "api/petshop/petsEntity",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
  public List<petsBean> retrievePets() {
      return petShopService.retrievePets();
  }
    @RequestMapping(value = "api/petshop/petsbehaviour",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public List<petsBehaviourBean> retrievePetsBehaviour(){
      return petShopService.retrievePetsBehaviour();
    }
    @RequestMapping(value = "api/petshop/petsfood",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public List<petsFoodBean> retrievePetsFood(){
      return petShopService.retrievePetsFood();
    }

//    @PostMapping("api/petshop/newpets")
//  public void savepets(@RequestBody petsEntity pets){
//    petsRepo.save(pets);
//    }

//
//    //Post Mapping
//  @RequestMapping(value = "api/petshop/petsupload",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
//  public ResponseEntity<String> uploadPets(@ResponseBody petsBean petsbean){
//    int i = petShopService.uploadPets(petsbean);
//    return new ResponseEntity<String>("Successfully uploaded a new pet with id"+i, HttpStatus.CREATED);
//
//  }
//
//  //Delete Mapping
//  @RequestMapping(value = "api/petshop/petsdelete",method = RequestMethod.DELETE,consumes = MediaType.APPLICATION_JSON_VALUE)
//  public ResponseEntity<String> deletePets(@RequestParam Integer id){
//        petShopService.deletePets(id);
//        return new ResponseEntity<String>("Pet with "+id+" has been deleted",HttpStatus.OK);
//  }



}
