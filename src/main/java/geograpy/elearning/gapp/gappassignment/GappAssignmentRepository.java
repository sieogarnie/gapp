package geograpy.elearning.gapp.gappassignment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GappAssignmentRepository extends JpaRepository<GappAssignment, Long> {
}
