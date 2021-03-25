package example.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class GreetController {

    @GetMapping("/")
    fun greet(): String {
        return "Hello, World from kotlin"
    }
}
