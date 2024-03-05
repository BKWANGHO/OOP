package service;

import model.Member;

import java.util.List;
import java.util.Map;

public interface AuthService {

    String join(Member user);

    String login();

    String addUsers();

    Member findUser(String username);

    Map<String, ?> getUserMap();

    List<?> getUserList();
    List<?> findUsersByName(String name);
    List<?> findUsersByJob(String job);
    String count();


}