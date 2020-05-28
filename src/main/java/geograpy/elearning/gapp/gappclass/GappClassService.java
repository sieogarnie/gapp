package geograpy.elearning.gapp.gappclass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GappClassService {

    @Autowired
    private GappClassRepository gappClassRepository;

    List<GappClass> getAllClasses(){
        return gappClassRepository.findAll();
    }
}
