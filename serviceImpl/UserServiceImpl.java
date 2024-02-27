package serviceImpl;

import model.MemberDTO;
import service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    @Override
    public String join(MemberDTO user) {
        return null;
    }

    @Override
    public String login(MemberDTO user) {
        return null;
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
