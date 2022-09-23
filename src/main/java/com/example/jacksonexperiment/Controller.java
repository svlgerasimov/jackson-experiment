package com.example.jacksonexperiment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private Entity entity;

    @PostMapping
    public void postEntity(@RequestBody Entity entity) {
        System.out.println("received: " + entity);
        this.entity = entity;
    }

    @GetMapping
    public Entity getEntity() {
        return entity;
    }
}
