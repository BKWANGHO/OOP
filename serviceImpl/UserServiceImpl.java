package serviceImpl;

import model.Member;
import service.UserService;
import service.UtilService;

import java.util.*;

public class UserServiceImpl implements UserService {

    Map<String, Member> users;
    private static UserService instance = new UserServiceImpl();

    private UserServiceImpl() {
        this.users = new HashMap<>();
    }

    public static UserService getInstance() {
        return instance;
    }



    @Override
    public Member join(Member user) {
        users.put(user.getUsername(), user);
        return users.get(user.getUsername());
    }

    @Override
    public String login(Member user) {
        Member userInMap = users.get(user.getUsername());
        String result = "";
        if (userInMap != null) {
            if (userInMap.getPassword().equals(user.getPassword())) {
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
    public Map<String, Member> addUsers() {
        UtilService util = UtilServiceImpl.getInstance();
        for (int i = 0; i < 5; i++) {
            String username = util.createRandomUsername();
            users.put(username,
                    Member.builder()
                            .username(username)
                            .password("123")
                            .confirmPassword("123")
                            .name(util.createRandomName())
                            .job("backsu")
                            .build());
        }
        return users;
    }

    @Override
    public String findUserBYId(Member user) {
        Member userInMap = users.get(user.getUsername());
        String result ="";
        if (userInMap != null) {
            userInMap = users.get(user.getUsername());
            result = "사용중인 아이디입니다.";
        } else {
            result = "없는 아이디입니다.";
        }
        return result;
    }

    @Override
    public String updatePassword(Member user) {
        Member userInMap = users.get(user.getUsername());
        String result = "";
        if (userInMap != null) {
            userInMap.setPassword(user.getPassword());
            userInMap.setConfirmPassword(user.getPassword());
            result = "비밀번호 변경 성공!";
        } else {
            result = "없는 아이디입니다.";
        }
        return result;
    }

    @Override
    public String deleteUser(Member user) {
        Member userInMap = users.get(user.getUsername());
        String result = "";
        if (userInMap != null) {
            users.remove(userInMap.getUsername());
            result = "삭제완료";
        } else {
            result = "없는 아이디입니다.";
        }
        return result;
    }

    @Override
    public Map<String, Member> getUserList() {
        users.forEach((k, v) ->
                System.out.println("{" + k + "," + v + "},"));
        return users;
    }

    @Override
    public List<Member> findUserByName(Member user) {
        List<Member> list = new ArrayList<>();
        for(String key : users.keySet()){
            Member nameMap = users.get(key);
            if(nameMap.getName().equals(user.getName())){
                list.add(nameMap);
            }
        }
        return list;
    }

    @Override
    public List<Member> findUserByJob(Member user) {
        List<Member> list = new ArrayList<>();
        for(String key : users.keySet()){
            Member userInMap = users.get(key);
            if(userInMap.getJob().equals(user.getJob())){
                list.add(userInMap);
            }
        }
        return list;
    }

    @Override
    public String countUser() {
        return "회원수는 : "+users.size() ;
    }
}
