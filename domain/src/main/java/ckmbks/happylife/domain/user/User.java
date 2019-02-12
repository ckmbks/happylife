package ckmbks.happylife.domain.user;

import ckmbks.happylife.domain.core.AggregateRoot;
import ckmbks.happylife.domain.user.enums.Sex;
import ckmbks.happylife.domain.user.enums.UserType;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
public class User implements AggregateRoot {

    @Id
    private long id;

    private String userName = "";

    private String password = "";

    private String phone = "";

    @Enumerated
    private UserType userType;

    @Enumerated
    private Sex sex;

    private Date createTime = new Date();

    private String createUser = "";

    private BigDecimal weight;

}
