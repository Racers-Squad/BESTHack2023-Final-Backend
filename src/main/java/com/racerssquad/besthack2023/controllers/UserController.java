package com.racerssquad.besthack2023.controllers;


import com.racerssquad.besthack2023.DTO.AuthRequest;
import com.racerssquad.besthack2023.exceptions.UserAlreadyExistsException;
import com.racerssquad.besthack2023.security.JwtUtils;
import com.racerssquad.besthack2023.services.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import com.racerssquad.besthack2023.exceptions.UserNotFoundException;
import com.racerssquad.besthack2023.exceptions.WrongPasswordException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("http://localhost:3000")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    JwtUtils jwtUtils;

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody AuthRequest user) {
        try {
            userService.register(user);
            log.debug("User " + user.getEmail() + " registered");
            return ResponseEntity.ok(jwtUtils.generateToken(user.getEmail()));
        } catch (UserAlreadyExistsException e) {
            log.debug("User " + user.getEmail() + " already exists");
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (Exception e) {
            log.error("An error occured in server", e);
            return ResponseEntity.badRequest().body("An error occurred on the server");
        }
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody AuthRequest user) {
        try {
            userService.login(user);
            log.debug("User " + user.getEmail() + " logged in");
            return ResponseEntity.ok(jwtUtils.generateToken(user.getEmail()));
        } catch (UserNotFoundException | WrongPasswordException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }


    @GetMapping("/check")
    public ResponseEntity<?> check(@RequestHeader(HttpHeaders.AUTHORIZATION) String auth) {
        String token = jwtUtils.restructJwtHeader(auth);
        if(token != null){
            if(jwtUtils.validateToken(token)){
                log.trace("Successful token check");
                return ResponseEntity.ok(jwtUtils.generateToken(jwtUtils.getEmailFromToken(token)));
            }
        }
        log.debug("Unsuccessful token check");
        return ResponseEntity.ok("LOGOUT");
    }

}