package Demo2;

import java.util.Random;
import java.util.Scanner;

public class RandomGame {
    public static void main(String[] args) {
        Random r = new Random();
        int randomNum = r.nextInt();
        Scanner sc = new Scanner(System.in);


        while(true){
            System.out.println("请输入猜测的数");
            int guessNum = sc.nextInt();
            if (guessNum > randomNum){
                System.out.println("太大了");
            }else if (guessNum < randomNum){
                System.out.println("太小了");
            }else {
                System.out.println("正确");
                break;
            }
        }
        System.out.println("游戏结束");
    }
}

