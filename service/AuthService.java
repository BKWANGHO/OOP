package service;

import model.MemberDTO;

import java.util.Map;
import java.util.Scanner;

public interface AuthService {

    String join(Scanner sc);

    String login();

    String addUsers();

    MemberDTO findUser(String username);

    Map<String, MemberDTO> getUserMap();

    String count();


}