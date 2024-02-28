package service;

import model.MemberDTO;

import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public interface UserService {
    MemberDTO join(MemberDTO user);
    String login(MemberDTO user);
    Map<String, MemberDTO> addUsers();
    String findUserBYId(MemberDTO user);
    String updatePassword(MemberDTO user);
    String deleteUser(MemberDTO user);
    Map<String, MemberDTO> getUserList();
    List<MemberDTO> findUserByName(MemberDTO user);
    List<MemberDTO> findUserByJob(MemberDTO user);
    String countUser();


}
