package geograpy.elearning.gapp.gapptask;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GappTaskService {

    @Autowired
    private GappTaskRepository gappTaskRepository;

    public Optional<GappTask> getTask(Long id){
        return gappTaskRepository.findById(id);
    }
}
