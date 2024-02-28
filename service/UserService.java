package service;

import model.MemberDTO;

import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public interface UserService {
    MemberDTO join(MemberDTO user);
    String login(MemberDTO user,Scanner sc);
    Map<String, MemberDTO> addUsers();
    MemberDTO findUserBYId(Scanner sc);
    MemberDTO updatePassword(MemberDTO user,Scanner sc);
    String deleteUser(Scanner sc);
    Map<String, MemberDTO> getUserList();
    List<MemberDTO> findUserByName(MemberDTO user,Scanner sc);
    List<MemberDTO> findUserByJob(Scanner sc);
    String countUser();


}
