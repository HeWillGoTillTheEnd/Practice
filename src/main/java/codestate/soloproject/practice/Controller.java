package codestate.soloproject.practice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/helloApplication")
    public String helloWorld(){
        return "To-Do Application !";
    }
}
