package geograpy.elearning.gapp.gappuser;

import geograpy.elearning.gapp.gappuser.GappUserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class GappUserDetailsService implements UserDetailsService {

    private GappUserRepository gappUserRepository;

    public GappUserDetailsService(GappUserRepository gappUserRepository) {
        this.gappUserRepository = gappUserRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return gappUserRepository.findByUsername(username);
    }
}
