package cm.belrose.serveurAngular11project.repository;

import cm.belrose.serveurAngular11project.entities.UserApp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAppRepository extends JpaRepository<UserApp, Long> {
    UserApp findUserAppByEmail(String email);
}
