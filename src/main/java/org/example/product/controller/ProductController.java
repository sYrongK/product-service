package org.example.product.controller;

import org.example.core.wrapper.ResultResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/apis")
public class ProductController {

    @GetMapping("/home")
    public ResultResponse<Void> home() {
        return new ResultResponse<>();
    }
}
