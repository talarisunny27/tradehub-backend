package com.tradehub.service;

import com.tradehub.dto.LoginRequest;
import com.tradehub.dto.RegisterRequest;

public interface UserService {

    String register(RegisterRequest request);

    String login(LoginRequest request);
}
