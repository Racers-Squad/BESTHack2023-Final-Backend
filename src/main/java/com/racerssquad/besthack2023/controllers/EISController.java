package com.racerssquad.besthack2023.controllers;

import com.racerssquad.besthack2023.DTO.EISRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin("http://localhost:3000")
public class EISController {

    @GetMapping("/eis/services")
    public ResponseEntity<?> getServices() {
        ArrayList<EISRequest> services = new ArrayList<>();
        services.add(new EISRequest(1, "Forex"));
        services.add(new EISRequest(2, "Tinek"));
        services.add(new EISRequest(3, "Mos"));
        services.add(new EISRequest(4, "Param"));
        services.add(new EISRequest(5, "Chlenix"));
        return ResponseEntity.ok(services);
    }

    @GetMapping("/eis/get/{id}")
    public ResponseEntity<?> getSelectedEIS(@PathVariable String id) {
        System.out.println(id);
        return ResponseEntity.ok('1');
    }
}
