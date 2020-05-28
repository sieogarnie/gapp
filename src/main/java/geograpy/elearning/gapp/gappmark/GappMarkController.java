package geograpy.elearning.gapp.gappmark;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GappMarkController {

    @Autowired
    private GappMarkService gappMarkService;

    @GetMapping("/marks")
    public List<GappMark> getAllUsers(){
        return gappMarkService.getAllMarks();
    }
}
