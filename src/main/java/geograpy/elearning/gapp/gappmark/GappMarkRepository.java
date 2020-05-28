package geograpy.elearning.gapp.gappmark;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GappMarkRepository extends JpaRepository<GappMark, Long> {

    List<GappMark> findByGappAssignmentId(Long assignmentId);
}
