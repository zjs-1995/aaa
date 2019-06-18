package Demo2;

public class DemoArray {
    public static void main(String[] args) {
        Person[] arr = new Person[3];
        Person one = new Person("迪丽热巴",18);
        Person two = new Person("古力娜扎",28);
        Person three = new Person("马尔扎哈",38);

       arr[0] = one;
       arr[1] = two;
       arr[2] = three;

    }
}
