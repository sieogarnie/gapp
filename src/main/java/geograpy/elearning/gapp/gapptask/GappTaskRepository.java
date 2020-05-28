package geograpy.elearning.gapp.gapptask;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GappTaskRepository extends JpaRepository<GappTask, Long> {
}
