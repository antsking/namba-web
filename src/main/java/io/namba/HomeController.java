package io.namba;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Evan on 22/10/16.
 */
@RestController
public class HomeController {
    @RequestMapping("/")
    public String home(){
        return "Hello World";
    }
}
