package ebay.backend.Image.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/images")
public class imageController {
    @GetMapping(path = "/hello")
    public String HelloImage(){
        return "Hello Image";
    }
}
