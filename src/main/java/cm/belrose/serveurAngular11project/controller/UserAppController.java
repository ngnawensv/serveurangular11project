package cm.belrose.serveurAngular11project.controller;

import cm.belrose.serveurAngular11project.entities.UserApp;
import cm.belrose.serveurAngular11project.service.UserAppService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
@Slf4j
@CrossOrigin(origins = "*", maxAge = 3600)
public class UserAppController {

    private UserAppService userAppService;


    @Autowired
    public UserAppController(UserAppService userAppService) {
        this.userAppService = userAppService;
    }

    @PostMapping(value = "/create")
    public UserApp create(@RequestBody UserApp userApp){
        log.info("Inside the create method");
        return userAppService.createUserApp(userApp);
    }

    @GetMapping(value = "/{id}")
    public UserApp findById(@PathVariable("id") Long id){
        log.info("Inside the findById method");
        return userAppService.findUserAppById(id);
    }

    @GetMapping(value = "/")
    public List<UserApp> findAll(){
        log.info("Inside the findAll method");
        return userAppService.findAllUserApp();
    }


}
