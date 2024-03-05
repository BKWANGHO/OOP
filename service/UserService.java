package service;

import model.Member;

import java.util.List;
import java.util.Map;

public interface UserService {
    Member join(Member user);
    String login(Member user);
    Map<String, ?> addUsers();
    String findUserBYId(Member user);
    String updatePassword(Member user);
    String deleteUser(Member user);
    Map<String, ?> getUserList();
    List<?> findUserByName(Member user);
    List<?> findUserByJob(Member user);
    String countUser();


}
