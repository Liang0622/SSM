package com.vic.bean;

public class Teacher {
    private Integer tid;
    private Integer age;
    private String tname;

    public Teacher(){

    }

    public Teacher(Integer tid, Integer age, String tname) {
        this.tid = tid;
        this.age = age;
        this.tname = tname;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tid=" + tid +
                ", age=" + age +
                ", tname='" + tname + '\'' +
                '}';
    }
}
