package his.rec.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import his.rec.model.User;
import his.rec.service.UserService;

@RestController
@RequestMapping("/user")
public class AuthController {
    
    @Autowired UserService userService;

    @PostMapping("/register")
    public ResponseEntity<User> register(@Validated @RequestBody final User user)  
    {
        User create = userService.save(user);
        return new ResponseEntity<User>(create, new HttpHeaders(), HttpStatus.OK);
    }
}