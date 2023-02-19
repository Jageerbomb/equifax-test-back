package com.example.demo.service;

import javax.xml.rpc.ServiceException;

public interface LoginService {

    Boolean authentication(String user, String password) throws ServiceException;
}
