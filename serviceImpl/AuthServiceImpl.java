package serviceImpl;

import service.AuthService;

public class AuthServiceImpl implements AuthService {

    private static AuthService instance = new AuthServiceImpl();

    private AuthServiceImpl(){};

    public AuthService getInstance(){
        return instance;
    }

    @Override
    public String login() {
        return null;
    }

    @Override
    public String join() {
        return null;
    }
}
