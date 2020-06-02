package geograpy.elearning.gapp.gappassignment;

import geograpy.elearning.gapp.gappmark.GappMark;
import geograpy.elearning.gapp.gappmark.GappMarkService;
import geograpy.elearning.gapp.gapptask.GappTask;
import geograpy.elearning.gapp.gapptask.GappTaskService;
import geograpy.elearning.gapp.gappuser.GappUser;
import geograpy.elearning.gapp.gappuser.GappUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GappAssignmentService {

    @Autowired
    private GappAssignmentRepository gappAssignmentRepository;
    @Autowired
    private GappMarkService gappMarkService;
    @Autowired
    private GappTaskService gappTaskService;
    @Autowired
    private GappUserService gappUserService;

    GappAssignmentMark getAssignmentMark(Long id){
        GappAssignmentMark gappAssignmentMark = new GappAssignmentMark();
        GappUser gappCurrentUser = gappUserService.getCurrentUser();
        if (gappCurrentUser == null){
            System.err.println("Could not get user session. In: getAssignmentMark()");
            return null;
        }
        Optional<GappAssignment> gappAssignment = gappAssignmentRepository.findById(id);
        if(gappAssignment.isPresent()){
            GappAssignment assignment = gappAssignment.get();
            gappAssignmentMark.setId(assignment.getId());
            gappAssignmentMark.setDueDate(assignment.getDueDate());
        }else{
            return null;
        }
        List<GappMark> assignmentMarks = gappMarkService.getAllMarksForAssignment(id);
        for(GappMark mark : assignmentMarks){
            if(mark.getGappAssignment().getId() == gappAssignment.get().getId() && mark.getGappUser().equals(gappUserService.getCurrentUser())){
                gappAssignmentMark.setMarkValue(mark.getMarkValue());
                gappAssignmentMark.setPassFail(mark.isPassFail());
                break;
            } else {
                gappAssignmentMark.setMarkValue((short)-1);
                gappAssignmentMark.setPassFail(false);
            }
        }

        Optional<GappTask> task = gappTaskService.getTask(gappAssignment.get().getGappTask().getId());
        task.ifPresent(gappTask -> gappAssignmentMark.setTaskName(gappTask.getName()));
        return gappAssignmentMark;
    }

    List<GappAssignment> getAssignments(){
            return gappAssignmentRepository.findAll();
    }

    GappAssignment saveAssignment(GappAssignment assignment) {
        return gappAssignmentRepository.save(assignment);
    }
}
