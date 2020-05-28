package geograpy.elearning.gapp.gappexercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class GappExerciseController {

    @Autowired
    private GappExerciseService gappExerciseService;

    @PostMapping("exercise")
    private void newExercise(@RequestBody GappExercise gappExercise){
        gappExerciseService.saveExercise(gappExercise);
    }

    @GetMapping("exercise")
    private List<GappExercise> getAllExercises(){
        return gappExerciseService.getAllExercises();
    }

    @GetMapping("exercise/{id}")
    private Optional<GappExercise> getExercise(@PathVariable Long id){
        return gappExerciseService.getExercise(id);
    }
}
