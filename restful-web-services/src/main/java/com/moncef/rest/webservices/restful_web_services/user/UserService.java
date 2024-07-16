package com.moncef.rest.webservices.restful_web_services.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;
    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public User saveUser(User user) {
        return userRepository.save(user);
    }
    public User getUserById(Integer id) {
        return userRepository.findById(id).orElse(null);
    }
    public User getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }
    public User updateUser(User user) {
        return userRepository.save(user);
    }
    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }

}
