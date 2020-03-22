package geograpy.elearning.gapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LearnController {

    @GetMapping("/learn")
    private String getLearn(){
        return "Learn";
    }
}
