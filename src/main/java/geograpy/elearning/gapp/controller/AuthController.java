package geograpy.elearning.gapp.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class AuthController {

    @GetMapping("/auth")
    public Collection<? extends GrantedAuthority> isLogged() {
        final Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if(null != authentication && !("anonymousUser").equals(authentication.getName())){
            return authentication.getAuthorities();
        }
        return null;
    }
}
