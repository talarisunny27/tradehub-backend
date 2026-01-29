package com.tradehub.controller;

import com.tradehub.dto.LoginRequest;
import com.tradehub.dto.RegisterRequest;
import com.tradehub.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final UserService userService;

    @PostMapping("/register")
    public String register(@RequestBody RegisterRequest request){
        return userService.register(request);
    }

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest request){
        return userService.login(request);
    }
}
