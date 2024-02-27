package controller;

import model.MemberDTO;
import service.AuthService;
import service.UserService;
import serviceImpl.AuthServiceImpl;
import serviceImpl.UserServiceImpl;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class UserController  {

    UserService user;

    public UserController() {
        this.user = UserServiceImpl.getInstance();
    }

    public String join(Scanner sc) {
        return user.join(sc);
    }
    public String login(MemberDTO user) {
        return null;
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
