package geograpy.elearning.gapp.gappmark;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GappMarkService {

    @Autowired
    private GappMarkRepository gappMarkRepository;

    List<GappMark> getAllMarks(){
        return gappMarkRepository.findAll();
    }

    public List<GappMark> getAllMarksForAssignment(Long assignmentId){return gappMarkRepository.findByGappAssignmentId(assignmentId);}
}