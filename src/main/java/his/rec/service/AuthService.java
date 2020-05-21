package his.rec.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import his.rec.model.User;
import his.rec.repository.UserRepository;

public class AuthService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username){
        User user=userRepository.findByUsernameAndStatus(username, 1);
        if(user==null){
            throw new UsernameNotFoundException(username+"heloohghj jjjkk");
        }
        return new org.springframework.security.core.userdetails.User(user.getUsername(),user.getPassword(), Arrays.asList(new SimpleGrantedAuthority("ADMIN")));
    }
    
}