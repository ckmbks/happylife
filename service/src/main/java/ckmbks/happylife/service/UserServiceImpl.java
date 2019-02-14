package ckmbks.happylife.service;

import ckmbks.happylife.domain.user.User;
import ckmbks.happylife.domain.user.UserLoginToken;
import ckmbks.happylife.domain.user.dto.UserLoginTokenDto;
import ckmbks.happylife.domain.user.repository.UserLoginTokenRepository;
import ckmbks.happylife.domain.user.repository.UserRepository;
import ckmbks.happylife.infrastructure.exception.AlertException;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.MessageFormat;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    public UserRepository UserRepository;
    @Autowired
    public UserLoginTokenRepository UserLoginTokenRepository;

    public UserLoginTokenDto login(String userName, String password) {
        var user = UserRepository.findByUserName(userName)
                .orElseThrow(() -> new AlertException(MessageFormat.format("不存在用户名{0}！", userName)));
        if (!user.getPassword().equals(password))
            throw new AlertException("密码错误！");

        var token = UserLoginTokenRepository.findByUserId(user.getId())
                .orElseGet(() -> new UserLoginToken(user));
        UserLoginTokenRepository.save(token);
        return new UserLoginTokenDto(token);
    }

    @Override
    public User getById(long id) {
        return UserRepository.findById(id)
                .orElseThrow(() -> new AlertException(MessageFormat.format("不存在用户id={0}！", id)));
    }

    @Override
    public User getByToken(String token) {
        return UserRepository.findByToken(token)
                .orElseThrow(() -> new AlertException("用户登录已失效或未登录！"));
    }
}
