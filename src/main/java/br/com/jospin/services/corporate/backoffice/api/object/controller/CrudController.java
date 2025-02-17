package br.com.jospin.services.corporate.backoffice.api.object.controller;

import br.com.jospin.services.corporate.backoffice.api.dto.ObjectDTO;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/object")
public class CrudController {

    @GetMapping(value="/list", produces = MediaType.APPLICATION_PROBLEM_JSON_VALUE)
    public ResponseEntity<List<ObjectDTO>> getHealthApplication() {
        return ResponseEntity.ok(Arrays.asList(new ObjectDTO()));
    }
}
