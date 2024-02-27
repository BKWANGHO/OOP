package serviceImpl;

import builder.MemberBuilder;
import controller.UserController;
import model.MemberDTO;
import service.AuthService;
import service.UserService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class UserServiceImpl implements UserService {
    private static UserService instance = new UserServiceImpl();

    private UserServiceImpl() {
        this.users = new HashMap<>();
    }

    public static UserService getInstance() {
        return instance;
    }

    Map<String, MemberDTO> users;

    @Override
    public String join(MemberDTO user) {
        users.put(user.getUsername(),user);
        return "회원가입 성공, ID : " + users.get(user.getUsername());
    }

    @Override
    public String login(MemberDTO user, Scanner sc) {
        System.out.println("아이디를 입력해주세요");
        user = users.get(sc.next());
        String result ="";
        if(user != null){
            System.out.println("비밀번호를 입력해주세요");
            if(sc.next().equals(user.getPassword())){
                result = "로그인 성공";
            }else {
                result = "비밀번호가 틀렸습니다.";
            }
        }else {
            result = "아이디가 틀렸습니다.";
        }
        return result;
    }




















    @Override
    public MemberDTO findUserBYId(String username) {
        return null;
    }

    @Override
    public void updatePassword(MemberDTO user) {

    }

    @Override
    public String deleteUser(String username) {
        return null;
    }

    @Override
    public List<MemberDTO> getUserList() {
        return null;
    }

    @Override
    public List<MemberDTO> findUserByName(String name) {
        return null;
    }

    @Override
    public List<MemberDTO> findUserByJob(String job) {
        return null;
    }

    @Override
    public int countUser() {
        return 0;
    }
}
