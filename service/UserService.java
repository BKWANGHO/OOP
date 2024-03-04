package service;

import model.Member;

import java.util.List;
import java.util.Map;

public interface UserService {
    Member join(Member user);
    String login(Member user);
    Map<String, Member> addUsers();
    String findUserBYId(Member user);
    String updatePassword(Member user);
    String deleteUser(Member user);
    Map<String, Member> getUserList();
    List<Member> findUserByName(Member user);
    List<Member> findUserByJob(Member user);
    String countUser();


}
