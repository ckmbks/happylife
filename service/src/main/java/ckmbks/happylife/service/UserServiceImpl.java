package ckmbks.happylife.service;

import ckmbks.happylife.domain.user.User;
import ckmbks.happylife.domain.user.repository.UserRepository;
import ckmbks.happylife.infrastructure.exception.AlertException;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    public UserRepository UserRepository;

    public User login(String userName, String password) {
        var result = UserRepository.findByUserName(userName);
        if (result == null)
            throw new AlertException("用户名不存在！");
        if (!result.getPassword().equals(password))
            throw new AlertException("密码错误！");
        return result;
    }
}
