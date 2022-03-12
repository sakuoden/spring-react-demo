package jtn.demo.presentation;

import org.springframework.web.bind.annotation.*;

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
