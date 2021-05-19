package com.service.impl;

import com.pojo.User;
import com.service.ILogin;
import org.springframework.stereotype.Service;

@Service
public class LoginService2 implements ILogin {
    @Override
    public int login(User user) {
        System.out.println("loginservice2的login方法"+user);
        return 0;
    }
}
