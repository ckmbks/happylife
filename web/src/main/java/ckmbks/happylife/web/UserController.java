package ckmbks.happylife.web;

import ckmbks.happylife.domain.user.User;
import ckmbks.happylife.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController extends BaseApiController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user/login", method = RequestMethod.GET)
    public User login(String userName, String password) {
        return userService.login(userName, password);
    }

}
