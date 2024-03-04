package controller;

import model.Member;
import service.UserService;
import serviceImpl.UserServiceImpl;

import java.util.*;

public class UserController {
    UserService user;

    public UserController() {
        this.user = UserServiceImpl.getInstance();
    }

    public Member join(Scanner sc) {
        return user.join(Member.builder()
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
        return user.login(Member.builder()
                .username(sc.next())
                .password(sc.next())
                        .build()
                );
    }

    public String findUserBYId(Scanner sc) {
        return user.findUserBYId(Member.builder()
                .username(sc.next())
                .build()
        );
    }

    public Map<String, Member> addUsers() {
        return user.addUsers();
    }

    public String updatePassword(Scanner sc) {

        return user.updatePassword(Member.builder()
                .username(sc.next())
                .password(sc.next())
                .confirmPassword(sc.next())
                .build()
        );
    }


    public String deleteUser(Scanner sc) {

        return user.deleteUser(Member.builder()
                .username(sc.next())
                .build()
        );
    }

    public Map<String, Member> getUserList() {

        return user.getUserList();
    }

    public List<Member> findUserByName(Scanner sc) {
        return user.findUserByName(Member.builder()
                .name(sc.next())
                .build());
    }

    public List<Member> findUserByJob(Scanner sc) {
        return user.findUserByJob(Member.builder()
                .job(sc.next())
                .build());
    }

    public String countUser() {
        return user.countUser();
    }
}
