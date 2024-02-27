package service;

import model.MemberDTO;

import java.util.List;
import java.util.Locale;

public interface UserService {
    String join(MemberDTO user);
    String login(MemberDTO user);
    MemberDTO findUserBYId(String username);
    void updatePassword(MemberDTO user);
    String deleteUser(String username);
    List<MemberDTO> getUserList();
    List<MemberDTO> findUserByName(String name);
    List<MemberDTO> findUserByJob(String job);
    int countUser();


}
