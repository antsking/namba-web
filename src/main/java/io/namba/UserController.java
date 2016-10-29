package io.namba;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Evan on 22/10/16.
 */
@RestController
public class UserController {
    @RequestMapping("/user")
    public User user(@RequestParam(value="id") long id){
        return new User(id,"evansu@namba.io");
    }
}
