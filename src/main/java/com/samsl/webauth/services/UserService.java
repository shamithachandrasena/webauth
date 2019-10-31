package com.samsl.webauth.services;

import com.samsl.onemarketsl.characters.User;
import org.jvnet.hk2.annotations.Service;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@Component
public class UserService implements com.samsl.onemarketsl.services.UserService{

    RestTemplate restTemplate = new RestTemplate();



    @Override
    public User addUser(User user) {
        String uri = "http://localhost:8080/onemarketsl/webapi/users/register";
        HttpHeaders headers = new HttpHeaders();
        headers.set("Accept", "*/*");
        HttpEntity<?> entity = new HttpEntity<>(user,headers);
        return restTemplate.postForObject(uri,entity,User.class,new Object());
    }

    @Override
    public List<User> getAllUsers() {
        String uri = "http://localhost:8080/onemarketsl/webapi/users/all";
        HttpHeaders headers = new HttpHeaders();
        headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
        HttpEntity<?> entity = new HttpEntity<>(headers);
        ResponseEntity<List<User>> response = restTemplate.exchange(
                uri,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<User>>(){});
        List<User> users = response.getBody();
        return users;
    }

    @Override
    public User getUserById(int id) {
        String uri = "http://localhost:8080/onemarketsl/webapi/users?id="+id;
        HttpHeaders headers = new HttpHeaders();
        headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
        HttpEntity<?> entity = new HttpEntity<>(headers);
        return restTemplate.getForObject(uri,User.class);
    }

    @Override
    public User updateUser(int i, User user) {
        return null;
    }

    @Override
    public User deleteUser(int i) {
        return null;
    }
}
