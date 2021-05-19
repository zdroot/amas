package com.service.impl;

import com.pojo.User;
import com.service.ILogin;
import org.springframework.stereotype.Service;

@Service("lg1")
public class LoginService implements ILogin {
    public int login(User user) {
        System.out.println("Service层的login"+user);
        return 0;
    }
}
