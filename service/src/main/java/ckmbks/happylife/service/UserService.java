package ckmbks.happylife.service;


import ckmbks.happylife.domain.user.User;
import ckmbks.happylife.domain.user.dto.UserLoginTokenDto;

public interface UserService {

    /**
     * 登录
     * @param userName
     * @param password
     */
    UserLoginTokenDto login(String userName, String password);

    /**
     * 获取
     * @param id
     * @return
     */
    User getById(long id);

    User getByToken(String token);

}
