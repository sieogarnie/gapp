package geograpy.elearning.gapp.gappclass;

import geograpy.elearning.gapp.gappuser.GappUser;
import geograpy.elearning.gapp.gappuser.GappUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GappClassController {

    @Autowired
    private GappUserService gappUserService;

    @Autowired
    private GappClassService gappClassService;

    @GetMapping("/classes")
    public List<GappClass> getAllClasses(){
        return gappClassService.getAllClasses();
    }

    @GetMapping("/classes/{id}")
    public List<GappUser> getAllUsers(@PathVariable Long id){
        return gappUserService.getUsersByClassId(id);
    }

    @PostMapping("/classes")
    public GappClass addClass(@RequestBody GappClass gappClass){
        return gappClassService.saveClass(gappClass);
    }

}
