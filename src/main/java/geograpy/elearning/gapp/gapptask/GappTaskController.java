package geograpy.elearning.gapp.gapptask;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class GappTaskController {

    @Autowired
    private GappTaskService gappTaskService;

    @GetMapping("/tasks")
    public List<GappTask> getTasks(){
        return gappTaskService.getAllTasks();
    }

    @GetMapping("/tasks/{id}")
    public Optional<GappTask> getTask(@PathVariable Long id){
        return gappTaskService.getTask(id);
    }

    @PostMapping("/tasks")
    public GappTask addTask(@RequestBody GappTask task){
        return gappTaskService.saveTask(task);
    }


}
