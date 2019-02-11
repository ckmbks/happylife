package ckmbks.happylife.service;


import ckmbks.happylife.domain.user.User;

public interface UserService {


    /**
     * 登录
     * @param userName
     * @param password
     */
    User login(String userName, String password);
}
