package kickstart.myfirstspringrest.controller;

import kickstart.myfirstspringrest.Hello;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @GetMapping({"/","/welcome","/index"})
    public String welcome(){
        return "hello and welcome";
    }

    @PostMapping("/")
    public Hello post(@RequestBody Hello payLoad){
        return payLoad;
    }

    @GetMapping("/{message}")
    public String printMessage(@PathVariable String message){
        return message;
    }

}
