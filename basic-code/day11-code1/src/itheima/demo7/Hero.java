package itheima.demo7;

public class Hero {
    private String name;
    private int age;
    private Skill skill;//英雄技能

    public void attack(){
        System.out.println("我叫" + name + "，开始施放技能：");
        skill.use();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hero() {
    }

    public Hero(String name) {
        this.name = name;
    }

    public Hero(int age, Skill skill) {
        this.age = age;
        this.skill = skill;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }
}
