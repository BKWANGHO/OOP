package serviceImpl;

import builder.MemberBuilder;
import model.MemberDTO;
import service.AuthService;
import service.UtilService;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AuthServiceImpl implements AuthService {

    private static AuthService instance = new AuthServiceImpl();

    private AuthServiceImpl() {
        this.users = new HashMap<>();
    }
    public static AuthService getInstance() {
        return instance;
    }

    Map<String, MemberDTO> users;

    @Override
    public String join(MemberDTO user) {

        users.put(user.getUsername(),user);
        return "회원가입 성공! username : " +user.getUsername();
    }

    @Override
    public String login() {
        return null;
    }

    @Override
    public MemberDTO findUser(String userName) {
        MemberDTO user = new MemberBuilder().build();
        return user;
    }

    @Override
    public String addUsers() {
        Map<String, MemberDTO> map = new HashMap<>();
        UtilService util = UtilServiceImpl.getInstance();
        for (int i = 0; i < 5; i++) {
        String username = util.createRandomName();
            map.put(username,
                    new MemberBuilder()
                            .username(username)
                            .password("123")
                            .confirmPassword("123")
                            .name(util.createRandomName())
                            .build());
        }
        users = map;
        return  "더미값 추가";
    }

    @Override
    public Map<String, MemberDTO> getUserMap() {
        users.forEach((k,v)->
                System.out.println("{"+k+","+v+"},"));
        return users;
    }

    @Override
    public String count() {
        return users.size()+"";
    }
}

















