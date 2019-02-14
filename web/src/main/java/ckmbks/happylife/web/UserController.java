package ckmbks.happylife.web;

import ckmbks.happylife.domain.user.User;
import ckmbks.happylife.domain.user.dto.UserLoginTokenDto;
import ckmbks.happylife.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController extends BaseApiController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user/login", method = {RequestMethod.GET, RequestMethod.POST})
    public UserLoginTokenDto login(String userName, String password) {
        return userService.login(userName, password);
    }

    @RequestMapping(value = "/user/getById", method = {RequestMethod.GET, RequestMethod.POST})
    public User getById(long id) {
        return userService.getById(id);
    }

    @RequestMapping(value = "/user/getByToken", method = {RequestMethod.GET, RequestMethod.POST})
    public User getByToken(String token) {
        return userService.getByToken(token);
    }

}
