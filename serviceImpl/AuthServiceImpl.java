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
    public String join(Scanner sc) {
        System.out.println("ID,비밀번호,비밀번호확인,이름,주민번호,전화번호,주소,직업을 입력해주세요");

        MemberDTO person = new MemberBuilder()
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
                .build();
        System.out.println(person.toString());
        return null;
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

















