package controller;

import builder.MemberBuilder;
import model.MemberDTO;
import service.UserService;
import serviceImpl.UserServiceImpl;

import java.util.*;

public class UserController {
    UserService user;

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
        return user.login(new MemberBuilder()
                .username(sc.next())
                .password(sc.next())
                        .build()
                );
    }

    public String findUserBYId(Scanner sc) {
        return user.findUserBYId(new MemberBuilder()
                .username(sc.next())
                .build()
        );
    }

    public Map<String, MemberDTO> addUsers() {
        return user.addUsers();
    }

    public String updatePassword(Scanner sc) {

        return user.updatePassword(new MemberBuilder()
                .username(sc.next())
                .password(sc.next())
                .confirmPassword(sc.next())
                .build()
        );
    }


    public String deleteUser(Scanner sc) {

        return user.deleteUser(new MemberBuilder()
                .username(sc.next())
                .build()
        );
    }

    public Map<String, MemberDTO> getUserList() {

        return user.getUserList();
    }

    public List<MemberDTO> findUserByName(Scanner sc) {
        return user.findUserByName(new MemberBuilder()
                .name(sc.next())
                .build());
    }

    public List<MemberDTO> findUserByJob(Scanner sc) {
        return user.findUserByJob(new MemberBuilder()
                .job(sc.next())
                .build());
    }

    public String countUser() {
        return user.countUser();
    }
}
