package geograpy.elearning.gapp.gappmark;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GappMarkService {

    @Autowired
    private GappMarkRepository gappMarkRepository;

    List<GappMark> getAllMarks(){
        return gappMarkRepository.findAll();
    }

    public List<GappMark> getAllMarksForAssignment(Long assignmentId){return gappMarkRepository.findByGappAssignmentId(assignmentId);}

    Optional<GappMark> getMark(Long id) {
        return gappMarkRepository.findById(id);
    }

    GappMark saveMark(GappMark mark) {
        return gappMarkRepository.save(mark);
    }
}