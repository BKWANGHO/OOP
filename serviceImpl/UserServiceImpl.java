package serviceImpl;

import builder.MemberBuilder;
import model.MemberDTO;
import service.UserService;
import service.UtilService;

import java.util.*;

public class UserServiceImpl implements UserService {

    Map<String, MemberDTO> users;
    private static UserService instance = new UserServiceImpl();

    private UserServiceImpl() {
        this.users = new HashMap<>();
    }

    public static UserService getInstance() {
        return instance;
    }



    @Override
    public MemberDTO join(MemberDTO user) {
        users.put(user.getUsername(), user);
        return users.get(user.getUsername());
    }

    @Override
    public String login(MemberDTO user, Scanner sc) {
        user = users.get(sc.next());
        String result = "";
        if (user != null) {
            if (sc.next().equals(user.getPassword())) {
                result = "로그인 성공!";
            } else {
                result = "비밀번호가 틀렸습니다.";
            }
        } else {
            result = "아이디가 틀렸습니다.";
        }
        return result;
    }

    @Override
    public Map<String, MemberDTO> addUsers() {
        UtilService util = UtilServiceImpl.getInstance();
        for (int i = 0; i < 5; i++) {
            String username = util.createRandomUsername();
            users.put(username,
                    new MemberBuilder()
                            .username(username)
                            .password("123")
                            .confirmPassword("123")
                            .name(util.createRandomName())
                            .build());
        }
        return users;
    }

    @Override
    public MemberDTO findUserBYId(Scanner sc) {
        String username = sc.next();
        MemberDTO user = users.get(username);
        if (user != null) {
            user = users.get(username);
        } else {
            System.out.println("없는 아이디입니다.");
        }
        return user;
    }

    @Override
    public MemberDTO updatePassword(MemberDTO user, Scanner sc) {
        user = users.get(sc.next());
        if (user != null) {
            System.out.println("변경할 비밀번호 입력하세요");
            user.setPassword(sc.next());
            System.out.println("한번더 입력하세요");
            user.setConfirmPassword(sc.next());
        } else {
            System.out.println("없는 아이디입니다. ");
        }
        return user;
    }

    @Override
    public String deleteUser(Scanner sc) {
        MemberDTO user = users.get(sc.next());
        String result = "";
        if (user != null) {
            users.remove(user.getUsername());
            result = "삭제완료";
        } else {
            result = "없는 아이디입니다.";
        }
        return result;
    }

    @Override
    public Map<String, MemberDTO> getUserList() {
        users.forEach((k, v) ->
                System.out.println("{" + k + "," + v + "},"));
        return users;
    }

    @Override
    public List<MemberDTO> findUserByName(MemberDTO user,Scanner sc) {

        List<MemberDTO> valueList = new ArrayList<>();






        return null;
    }

    @Override
    public List<MemberDTO> findUserByJob(Scanner sc) {
        List<MemberDTO> list = new ArrayList<>();
        for(String key : users.keySet()){
            MemberDTO user = users.get(key);
            if(user.getJob().equals(sc.next())){
                list.add(user);
            }
        }
        return list;
    }

    @Override
    public String countUser() {
        return users.size() + "";
    }
}
