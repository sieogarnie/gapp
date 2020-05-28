package geograpy.elearning.gapp.gappclass;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GappClassRepository extends JpaRepository<GappClass,Long> {

}
