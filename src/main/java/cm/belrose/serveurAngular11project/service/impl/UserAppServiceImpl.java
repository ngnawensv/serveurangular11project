package cm.belrose.serveurAngular11project.service.impl;

import cm.belrose.serveurAngular11project.entities.UserApp;
import cm.belrose.serveurAngular11project.repository.UserAppRepository;
import cm.belrose.serveurAngular11project.service.UserAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserAppServiceImpl implements UserAppService {

    private UserAppRepository userAppRepository;


    @Autowired
    public UserAppServiceImpl(UserAppRepository userAppRepository) {
        this.userAppRepository = userAppRepository;
    }

    @Override
    public UserApp createUserApp(UserApp userApp) {
        return userAppRepository.save(userApp);
    }

    @Override
    public UserApp findUserAppById(Long id) {
        return userAppRepository.findById(id).get();
    }

    @Override
    public List<UserApp> findAllUserApp() {
        return userAppRepository.findAll();
    }
}
