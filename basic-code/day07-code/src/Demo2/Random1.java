package Demo2;

import java.util.Random;

public class Random1 {
    public static void main(String[] args) {
        Random r = new Random();
      //  int n = 10;
//        int num = r.nextInt(n) + 1;
//        System.out.println(num);
       /* for (int i = 0; i < 100; i++) {
            int num = r.nextInt(n)+1;
            System.out.println(num);
        }*/
        for (int i = 0; i < 10; i++) {
            int num = r.nextInt(5);
            System.out.println(num);
        }
    }
}

