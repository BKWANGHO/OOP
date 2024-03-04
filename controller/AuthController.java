package controller;

import model.Member;
import service.AuthService;
import serviceImpl.AuthServiceImpl;

import java.util.Map;
import java.util.Scanner;

public class AuthController {
    AuthService auth;

    public AuthController() {

        this.auth = AuthServiceImpl.getInstance();
    }
    public String join(Scanner sc) {

        return auth.join(Member.builder()
                .username(sc.next())
                .password(sc.next())
                .confirmPassword(sc.next())
                .name(sc.next())
                .personId(sc.nextInt())
                .phoneNumber(sc.nextInt())
                .address(sc.next())
                .job(sc.next())
                .height(sc.nextInt())
                .weight(sc.nextInt())
                .build());
    }

    public String login(Scanner sc) {
        return auth.login();
    }

    public Member findUser(String username) {

        return auth.findUser(username);
    }

    public String addUsers() {
        return auth.addUsers();
    }
    public Map<String, ?> getUserMap() {
        return auth.getUserMap();
    }

    public String count() {
        return auth.count();
    }





}
