package com.isp.faiaz;

import java.io.Serializable;

public class User extends Person{

    public User(String id, String userName, String password, int age) {
        super(id, userName, password, age);
    }

    public User() {
        super();
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                '}';
    }
}
