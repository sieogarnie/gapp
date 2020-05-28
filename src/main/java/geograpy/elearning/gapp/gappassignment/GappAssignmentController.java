package geograpy.elearning.gapp.gappassignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GappAssignmentController {

    @Autowired
    private GappAssignmentService gappAssignmentService;

    @GetMapping("/assignments")
    public List<GappAssignment> getAssignments(){
        return gappAssignmentService.getAssignments();
    }

    @GetMapping("/assignments/{id}")
    public GappAssignmentMark getAssignmentMark(@PathVariable Long id){
        return gappAssignmentService.getAssignmentMark(id);
    }




}
