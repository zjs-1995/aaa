package com.itheima.domain;

public class Student {
    private Integer sid;
    private String sname;
    private String sex;
    private Integer score;

    public Student() {
    }

    public Student(Integer sid, String sname, String sex, Integer score) {
        this.sid = sid;
        this.sname = sname;
        this.sex = sex;
        this.score = score;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", sex='" + sex + '\'' +
                ", score=" + score +
                '}';
    }
}
