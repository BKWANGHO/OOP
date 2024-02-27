package controller;

import builder.MemberBuilder;
import model.MemberDTO;
import service.UserService;
import serviceImpl.UserServiceImpl;

import java.util.*;

public class UserController  {
    UserService user;
    MemberDTO member;

    public UserController() {
        this.user = UserServiceImpl.getInstance();
    }

    public void join(Scanner sc) {
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
        System.out.println(user.join(person));
    }
    public void login(Scanner sc) {

        System.out.println(user.login(member,sc));
    }


    public MemberDTO findUserBYId(String username) {
        return null;
    }

    public void updatePassword(MemberDTO user) {

    }
    public String deleteUser(String username) {
        return null;
    }

    public List<MemberDTO> getUserList() {
        return null;
    }

    public List<MemberDTO> findUserByName(String name) {
        return null;
    }

    public List<MemberDTO> findUserByJob(String job) {
        return null;
    }

    public int countUser() {
        return 0;
    }
}
