package geograpy.elearning.gapp.gappexercise;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GappExerciseRepository extends JpaRepository<GappExercise, Long> {
}
