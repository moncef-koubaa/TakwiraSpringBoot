package com.moncef.rest.webservices.restful_web_services.user;

public interface UserRepository extends org.springframework.data.mongodb.repository.MongoRepository<User, Integer>{
    User findByEmail(String email);
}
