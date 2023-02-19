package com.example.demo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.xml.rpc.ServiceException;

@Service
@Slf4j
public class LoginServiceImpl implements LoginService {

    @Value("${login.user}")
    private String adminUser;

    @Value("${login.password}")
    private String adminPass;

    @Override
    public Boolean authentication(String username, String password) throws ServiceException {
        if (username == null || !username.trim().equals(adminUser)) throw new ServiceException("Usuario incorrecto");
        if (password == null || !password.equals(adminPass)) throw new ServiceException("Contraseña incorrecta");
        return true;
    }
}
