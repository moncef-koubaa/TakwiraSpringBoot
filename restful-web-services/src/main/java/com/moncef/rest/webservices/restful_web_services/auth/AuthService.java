package com.moncef.rest.webservices.restful_web_services.auth;


import com.moncef.rest.webservices.restful_web_services.security.AuthenticationResponse;
import com.moncef.rest.webservices.restful_web_services.security.JwtTokenProvider;
import com.moncef.rest.webservices.restful_web_services.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtTokenProvider jwtTokenProvider;

    private UserRepository userRepository;
    public AuthenticationResponse authenticateUser(LoginRequest loginRequest) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(loginRequest.getEmail(), loginRequest.getPassword())
        );
        String token = jwtTokenProvider.generateToken(authentication);
        return new AuthenticationResponse(token);
    }
}
