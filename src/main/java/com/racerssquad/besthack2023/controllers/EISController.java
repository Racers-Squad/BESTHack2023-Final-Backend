package com.racerssquad.besthack2023.controllers;

import com.racerssquad.besthack2023.DTO.EISRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin("http://localhost:3000")
public class EISController {

    @GetMapping("/eis/services")
    public ResponseEntity<?> getServices() {
        ArrayList<EISRequest> services = new ArrayList<>();
        services.add(new EISRequest("Forex",30));
        services.add(new EISRequest("Tinek",22));
        services.add(new EISRequest("Mos",6));
        services.add(new EISRequest("Param",15));
        services.add(new EISRequest("Chlenix",2));
        return ResponseEntity.ok(services);
    }
}
