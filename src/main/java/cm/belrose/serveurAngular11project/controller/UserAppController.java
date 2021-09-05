package cm.belrose.serveurAngular11project.controller;

import cm.belrose.serveurAngular11project.entities.UserApp;
import cm.belrose.serveurAngular11project.service.UserAppService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping(value = "/users")
@Slf4j
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

    @GetMapping(value = "/id/{id}")
    public UserApp findById(@PathVariable("id") Long id){
        log.info("Inside the findById method");
        return userAppService.findUserAppById(id);
    }

    @GetMapping(value = "/")
    public List<UserApp> findAll(){
        log.info("Inside the findAll method");
        return userAppService.findAllUserApp();
    }

    @GetMapping(value = "/email/{email}")
    public UserApp findByEmail(@PathVariable("email") String email){
        log.info("Inside the findByEmail method");
        return userAppService.findUserAppByEmail(email);
    }



}
