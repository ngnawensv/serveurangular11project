package cm.belrose.serveurAngular11project.service;

import cm.belrose.serveurAngular11project.entities.UserApp;

import java.util.List;

public interface UserAppService {
    UserApp createUserApp(UserApp userApp);

    UserApp findUserAppById(Long id);

    List<UserApp> findAllUserApp();

    UserApp findUserAppByEmail(String email);

}
