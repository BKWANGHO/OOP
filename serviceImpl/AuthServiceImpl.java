package serviceImpl;

import model.Member;
import service.AuthService;
import service.UtilService;

import java.util.*;

public class AuthServiceImpl implements AuthService {

    private static AuthService instance = new AuthServiceImpl();

    private AuthServiceImpl() {
        this.users = new HashMap<>();
        this.userList = new ArrayList<>();
    }
    public static AuthService getInstance() {
        return instance;
    }

    Map<String, Member> users;
    List<Member> userList;

    @Override
    public String join(Member user) {

        users.put(user.getUsername(),user);
        return "회원가입 성공! username : " +user.getUsername();
    }

    @Override
    public String login() {
        return null;
    }

    @Override
    public Member findUser(String userName) {
//        Member user = Member.builder()

        return null;
    }

    @Override
    public String addUsers() {
        Map<String, Member> map = new HashMap<>();
        UtilService util = UtilServiceImpl.getInstance();
        for (int i = 0; i < 5; i++) {
        String username = util.createRandomName();
            map.put(username,
                    Member.builder()
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
    public Map<String, Member> getUserMap() {
        users.forEach((k,v)->
                System.out.println("{"+k+","+v+"},"));
        return users;
    }

    @Override
    public String count() {
        return users.size()+"";
    }
}

















