package ckmbks.happylife.domain.user;

import ckmbks.happylife.domain.core.AggregateRoot;
import ckmbks.happylife.domain.user.enums.Sex;
import ckmbks.happylife.domain.user.enums.UserType;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class User implements AggregateRoot {

    @Id
    private long id;

    @Column(nullable = false, unique = true, columnDefinition = ("varchar(50) COMMENT '登录名'"))
    private String userName = "";

    @Column(nullable = false, columnDefinition = ("varchar(50) COMMENT '登录密码'"))
    private String password = "";

    @Column(nullable = false)
    private String phone = "";

    @Column(nullable = false)
    @Enumerated
    private UserType userType;

    @Column(nullable = false)
    @Enumerated
    private Sex sex;

    @Column(nullable = false)
    private Date createTime = new Date();

    @Column(nullable = false)
    private String createUser = "";
}
