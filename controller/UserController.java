package controller;

import builder.MemberBuilder;
import model.MemberDTO;
import service.UserService;
import serviceImpl.UserServiceImpl;

import java.util.*;

public class UserController {
    UserService user;
    MemberDTO member;

    public UserController() {
        this.user = UserServiceImpl.getInstance();
    }

    public MemberDTO join(Scanner sc) {
        return user.join(new MemberBuilder()
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
        return user.login(member, sc);
    }

    public MemberDTO findUserBYId(Scanner sc) {

        return user.findUserBYId(sc);
    }

    public Map<String, MemberDTO> addUsers() {
        return user.addUsers();
    }

    public MemberDTO updatePassword(Scanner sc) {
        return user.updatePassword(member, sc);
    }


    public String deleteUser(Scanner sc) {
        return user.deleteUser(sc);
    }

    public Map<String, MemberDTO> getUserList() {

        return user.getUserList();
    }

    public List<MemberDTO> findUserByName(Scanner sc) {


        return null;
    }

    public List<MemberDTO> findUserByJob(Scanner sc) {
        return user.findUserByJob(sc);
    }

    public String countUser() {
        return user.countUser();
    }
}
