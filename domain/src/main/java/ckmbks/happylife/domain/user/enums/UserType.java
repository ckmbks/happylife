package ckmbks.happylife.domain.user.enums;

public enum UserType {
    InnerUser("系统用户", 1),
    OuterUser("外部用户", 2);

    private String name;
    private int index;

    private UserType(String name, int index) {
        this.name = name;
        this.index = index;
    }

    @Override
    public String toString() {
        return this.index + "_" + this.name;
    }
}

