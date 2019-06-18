package itheima.demo6;

public class DemoMain {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("剑圣");
        hero.setAge(18);

        Weapon weapon = new Weapon("无极之剑");
        hero.setWeapon(weapon);
        hero.attack();
    }
}
