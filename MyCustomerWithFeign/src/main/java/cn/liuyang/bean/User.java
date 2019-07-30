package cn.liuyang.bean;

import java.util.Date;

/**
 * Created by  liuyang
 * 2019/7/24    10:31
 * cn.liuyang.bean
 * All Right Reserved by liuyang.
 **/

public class User {
    private Long id;
    private Date birthdate;
    private String firstname;
    private String lastname;
    private char gender;
    private Date hiredate;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", birthdate=" + birthdate +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", gender=" + gender +
                ", hiredate=" + hiredate +
                '}';
    }

}
