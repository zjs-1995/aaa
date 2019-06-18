package itheima.demo6;

public class Hero {
    private  String name;
    private int age;
    private Weapon weapon;

    public void attack(){
        System.out.println("年龄"+getAge()+getName()+"用"+weapon.getCode()+"攻击盖伦");
    }
    public Hero() {
    }

    public Hero(String name, int age, Weapon weapon) {
        this.name = name;
        this.age = age;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
