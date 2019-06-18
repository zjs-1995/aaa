package Demo3;

//import java.util.ArrayList;
//import java.util.Random;

import java.util.ArrayList;
import java.util.Random;

public class ArraryListRandom {
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            int num = r.nextInt(33)+1;//随机拿一个数
            System.out.println(num);
            list.add(num);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
