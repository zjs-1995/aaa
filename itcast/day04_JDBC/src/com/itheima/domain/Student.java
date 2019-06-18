package com.itheima.domain;

public class Student {
    private int sid;
    private String sname;
    private String sex;
    private int score;

    public Student() {
    }

    public Student(int sid, String sname, String sex, int score) {
        this.sid = sid;
        this.sname = sname;
        this.sex = sex;
        this.score = score;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
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
