package com.racerssquad.besthack2023.controllers;

import com.racerssquad.besthack2023.DTO.StockRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin("http://localhost:3000")
@Slf4j
public class StockController {

    ArrayList<StockRequest> services = new ArrayList<>() {{
        add(new StockRequest("QWD", "asda", "171634", "1", "124124412", "10-10-2010"));
        add(new StockRequest("ASD", "afgjhfj", "134576", "2", "1412421", "10-10-2010"));
        add(new StockRequest("ZXC", "awdfaw", "352", "3", "345345", "10-10-2010"));
        add(new StockRequest("XYZ", "xui", "1337", "0", "123123123", "10-10-2010"));
        add(new StockRequest("TUYKJ", "wertwet", "", "5", "23576457", "10-10-2010"));
        add(new StockRequest("HYJ", "ului", "358", "6", "32456743", "10-10-2010"));
        add(new StockRequest("ADF", "erty", "15324", "7", "21512", "10-10-2010"));
        add(new StockRequest("GHJK", "xbvx", "38795", "8", "4278478", "10-10-2010"));
        add(new StockRequest("AWF", "yilpo", "1253", "9", "2457245", "10-10-2010"));
        add(new StockRequest("Forex", "stjr", "673145", "10", "1346134", "10-10-2010"));
    }};

    @GetMapping("/stocks/{name}")
    public ResponseEntity<?> getStocks(@PathVariable String name) {
        log.info("Getting stocks for name " + name);
        return ResponseEntity.ok(services);
    }

    @GetMapping("/stock/{code}")
    public ResponseEntity<?> getStockByCode(@PathVariable String code) {
        log.info("Getting stocks for code: " + code);
        for (StockRequest stock : services) {
            if (stock.getCode().equals(code)) {
                return ResponseEntity.ok(stock);
            }
        }
        return ResponseEntity.badRequest().body("No such element in array!");
    }
}