package com.example.courseapi.health;

import org.springframework.http.CacheControl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Health {
    @RequestMapping("/health")
    public ResponseEntity<Void> getHealth() {
        return ResponseEntity
                .ok()
                .cacheControl(CacheControl.noCache())
                .build();
    }
}
