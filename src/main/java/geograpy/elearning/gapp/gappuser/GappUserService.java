package geograpy.elearning.gapp.gappuser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GappUserService {

    @Autowired
    private GappUserRepository gappUserRepository;

    List<GappUser> getAllUsers(){
        return gappUserRepository.findAll();
    }

    Optional<GappUser> getUser(Long id){
        return gappUserRepository.findById(id);
    }

    public List<GappUser> getUsersByClassId(Long classId){
        return gappUserRepository.findByGappClassId(classId);
    }

    public GappUser getCurrentUser(){

        final String ANONYMOUS_USER = "anonymousUser";
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if(authentication != null && authentication.getPrincipal() != null){
            if(!authentication.getPrincipal().equals(ANONYMOUS_USER)) {
                return (GappUser) authentication.getPrincipal();
            }
        }
        return null;

    }

    GappUser saveUser(GappUser user) {
        return gappUserRepository.save(user);
    }
}
