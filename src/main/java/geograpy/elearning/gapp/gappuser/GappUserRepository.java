package geograpy.elearning.gapp.gappuser;

import geograpy.elearning.gapp.gappuser.GappUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GappUserRepository extends JpaRepository<GappUser, Long> {

    GappUser findByUsername(String username);

    List<GappUser> findByGappClassId(Long classId);

}
