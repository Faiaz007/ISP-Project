package com.isp.faiaz;

public class User extends Person{

    public User(String id, String userName, String password, int age) {
        super(id, userName, password, age);
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
