package com.racerssquad.besthack2023.services;

import com.racerssquad.besthack2023.DTO.AuthRequest;
import com.racerssquad.besthack2023.entites.UserEntity;
import com.racerssquad.besthack2023.exceptions.UserAlreadyExistsException;
import com.racerssquad.besthack2023.exceptions.UserNotFoundException;
import com.racerssquad.besthack2023.exceptions.WrongPasswordException;
import com.racerssquad.besthack2023.repositories.UserRepository;
import com.racerssquad.besthack2023.security.Hasher;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void register(AuthRequest authRequest) throws UserAlreadyExistsException {
        if (userRepository.existsByEmail(authRequest.getEmail())) {
            throw new UserAlreadyExistsException("Email is already in use.");
        }
        UserEntity user = new UserEntity(authRequest.getEmail(), Hasher.encryptMD5(authRequest.getPassword()));
        userRepository.save(user);
    }

    public void login(AuthRequest authRequest) throws UserNotFoundException, WrongPasswordException {
        if (!userRepository.existsByEmail(authRequest.getEmail())) {
            throw new UserNotFoundException(authRequest.getEmail());
        }
        UserEntity entity = userRepository.findByEmail(authRequest.getEmail());
        if (!Hasher.encryptMD5(authRequest.getPassword()).equals(entity.getPassword())) {
            throw new WrongPasswordException(authRequest.getEmail());
        }
    }
}

