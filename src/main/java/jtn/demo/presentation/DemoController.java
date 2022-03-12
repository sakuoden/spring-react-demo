package jtn.demo.presentation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demo")
public class DemoController {
    @GetMapping
    String demo() {
        return "remo";
    }

    @PostMapping("/{demoNumber}")
    void demo(@PathVariable String demoNumber) {
        System.out.println(demoNumber);
    }
}
