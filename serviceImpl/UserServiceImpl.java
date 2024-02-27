package serviceImpl;

import builder.MemberBuilder;
import model.MemberDTO;
import service.AuthService;
import service.UserService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class UserServiceImpl implements UserService {
    private static UserService instance = new UserServiceImpl();

    private UserServiceImpl() {
        this.users = new HashMap<>();
    }

    public static UserService getInstance() {
        return instance;
    }

    Map<String, MemberDTO> users;

    @Override
    public String join(Scanner sc) {

        System.out.println("ID,비밀번호,비밀번호확인,이름,주민번호,전화번호,주소,직업,키,몸무게를 입력해주세요");

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
    public String login(MemberDTO user) {
        return null;
    }

    @Override
    public MemberDTO findUserBYId(String username) {
        return null;
    }

    @Override
    public void updatePassword(MemberDTO user) {

    }

    @Override
    public String deleteUser(String username) {
        return null;
    }

    @Override
    public List<MemberDTO> getUserList() {
        return null;
    }

    @Override
    public List<MemberDTO> findUserByName(String name) {
        return null;
    }

    @Override
    public List<MemberDTO> findUserByJob(String job) {
        return null;
    }

    @Override
    public int countUser() {
        return 0;
    }
}
