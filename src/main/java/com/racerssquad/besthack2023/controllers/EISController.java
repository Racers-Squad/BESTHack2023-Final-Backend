package com.racerssquad.besthack2023.controllers;

import com.racerssquad.besthack2023.DTO.*;
import com.racerssquad.besthack2023.DTO.proto.*;
import com.racerssquad.besthack2023.services.CentralService;
import com.racerssquad.besthack2023.util.GenerateRequestToExecuteCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

@RestController
@CrossOrigin("http://localhost:3000")
@Slf4j
public class EISController {

    @Autowired
    private CentralService centralService;

    @Autowired
    private GenerateRequestToExecuteCommand generateRequestToExecuteCommand;

    @GetMapping("/eis/services")
    public ResponseEntity<?> getServices() {
        log.info("Getting all available services");
        ArrayList<EISRequest> services = new ArrayList<>();
        services.add(new EISRequest(1, "Forex"));
        services.add(new EISRequest(2, "Tinek"));
        services.add(new EISRequest(3, "Mos"));
        services.add(new EISRequest(4, "Param"));
        services.add(new EISRequest(5, "Chlenix"));
        return ResponseEntity.ok(services);
    }

    @GetMapping("/eis/get/{id}")
    public ResponseEntity<?> getModeOfData(@PathVariable String id) {
        if (Objects.equals(id, "null")) {
            return ResponseEntity.ok(new EISInfoDTO(0, Collections.emptyList()));
        }
        log.info("Getting mode of translating data to GUI");
        List<ParameterResponse> params = new ArrayList<>();
        params.add(new ParameterResponse(1, "Date from", "Date from which blah blah"));
        params.add(new ParameterResponse(2, "Date to", "Description of date to"));
        CommandResponse com1 = new CommandResponse(1, "Date calculation", "Data between dates", params);

        List<ParameterResponse> params2 = new ArrayList<>();
        params2.add(new ParameterResponse(1, "gugugaga", "VEry important parameter"));
        CommandResponse com2 = new CommandResponse(2, "rom?",
                "How many bottles of rome can you buy for the cost of these actions?", params2);
        return ResponseEntity.ok(new EISInfoDTO(2, List.of(com1, com2)));
    }

    @PostMapping("/{id}/execute")
    public ResponseEntity<?> getModeOfData(@PathVariable String id, @RequestBody CommandRequest request) {
        log.info("Recieve a command message!");
        centralService.executeCommand(id, request);
        return ResponseEntity.ok("");
    }
}
