package geograpy.elearning.gapp.gappmark;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class GappMarkController {

    @Autowired
    private GappMarkService gappMarkService;

    @GetMapping("/marks")
    public List<GappMark> getAllMarks(){
        return gappMarkService.getAllMarks();
    }

    @GetMapping("/marks/{id}")
    public Optional<GappMark> getMark(@PathVariable Long id){
        return gappMarkService.getMark(id);
    }

    @PostMapping("/marks")
    public GappMark addMark(@RequestBody GappMark mark){
        return gappMarkService.saveMark(mark);
    }
}
