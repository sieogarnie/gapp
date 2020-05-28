package geograpy.elearning.gapp.gappuser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class GappUserController {

    @Autowired
    private GappUserService gappUserService;

    @GetMapping("/users")
    public List<GappUser> getAllUsers(){
        return gappUserService.getAllUsers();
    }

    @GetMapping("/users/{id}")
    public Optional<GappUser> getUser(@PathVariable Long id){
        return gappUserService.getUser(id);
    }

}
