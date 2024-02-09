package com.example.Exercise3;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
class NameController {

    @GetMapping("/getName")
    public String getName(@RequestParam String name) {
        return "Nome: " + name;
    }
    @PostMapping("/reverseName")
    public String reverseName(@RequestParam String name) {
        StringBuilder reversedName = new StringBuilder(name).reverse();
        return "Nome al contrario: " + reversedName.toString();
    }
}