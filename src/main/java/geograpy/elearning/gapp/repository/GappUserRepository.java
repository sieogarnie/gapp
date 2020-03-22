package geograpy.elearning.gapp.repository;

import geograpy.elearning.gapp.model.GappUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GappUserRepository extends JpaRepository<GappUser, Long> {

    GappUser findByUsername(String username);

}
