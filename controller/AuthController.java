package controller;

import builder.MemberBuilder;
import model.MemberDTO;
import service.AuthService;
import service.UtilService;
import serviceImpl.AuthServiceImpl;
import serviceImpl.UtilServiceImpl;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AuthController {
    AuthService auth;

    public AuthController() {
        this.auth = AuthServiceImpl.getInstance();
    }
    public String join(Scanner sc) {

        return auth.join(new MemberBuilder()
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

    public MemberDTO findUser(String username) {

        return auth.findUser(username);
    }

    public String addUsers() {
        return auth.addUsers();
    }
    public Map<String, MemberDTO> getUserMap() {
        return auth.getUserMap();
    }

    public String count() {
        return auth.count();
    }





}
