package com.moncef.rest.webservices.restful_web_services.auth;

import com.moncef.rest.webservices.restful_web_services.security.AuthenticationResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest) {
        AuthenticationResponse authenticationResponse = authService.authenticateUser(loginRequest);
        return ResponseEntity.ok(authenticationResponse);
    }

}
