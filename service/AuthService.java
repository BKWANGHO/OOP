package service;

import model.Member;

import java.util.Map;

public interface AuthService {

    String join(Member user);

    String login();

    String addUsers();

    Member findUser(String username);

    Map<String, Member> getUserMap();

    String count();


}