package controller;

import model.MemberDTO;
import service.AuthService;
import serviceImpl.AuthServiceImpl;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class UserController {

    private Map<String, MemberDTO> users;

    public UserController() {
        this.users = new HashMap<>();
    }

    public void addUsers() {
//        AuthService auth = AuthServiceImpl.getInstance();
//        this.users = auth.addUsers();
    }

    public void findUser(String username) {
        System.out.println(users.get(username));
    }

    public void getUserList() {

    }
}
