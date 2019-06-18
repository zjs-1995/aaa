package Demo2;

import java.util.Scanner;

public class Scannerkk {
    public static void main(String[] args) {
//      int num =  new Scanner(System.in).nextInt();
//        System.out.println("输入的是:"+num);

//        Scanner sc = new Scanner(System.in);
//        methodParam(sc);

        methodParam(new Scanner(System.in));
    }
    public static void methodParam(Scanner sc){
        int num = sc.nextInt();
        System.out.println("输入的是:"+num);

    }
}
