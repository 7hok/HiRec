package his.rec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller 
public class HomeController {
    
    @GetMapping("/transac")
    public String transac(){
        return "user/transaction" ;
    }

    @GetMapping("/history")
    public String history(){
        return "user/history" ;
    }
    @GetMapping("/report")
    public String report(){
        return "user/report" ;
    }

    @GetMapping("/graph")
    public String graph(){
        return "user/graph" ;
    }
}