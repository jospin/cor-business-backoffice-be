package br.com.jospin.services.corporate.backoffice.health.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class HealthController {

    @GetMapping(value="/application", produces = MediaType.APPLICATION_PROBLEM_JSON_VALUE)
    public ResponseEntity<String> getHealthApplication() {
        return ResponseEntity.ok("Ok");
    }
}
