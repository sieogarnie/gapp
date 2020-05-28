package geograpy.elearning.gapp.gappexercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GappExerciseService {

    @Autowired
    private GappExerciseRepository gappExerciseRepository;

    Optional<GappExercise> getExercise(Long id){
        return gappExerciseRepository.findById(id);
    }

    List<GappExercise> getAllExercises(){
        return gappExerciseRepository.findAll();
    }

    void saveExercise(GappExercise gappExercise) {
        gappExerciseRepository.save(gappExercise);
    }
}
