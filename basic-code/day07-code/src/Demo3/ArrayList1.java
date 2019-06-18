package Demo3;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        //增
        list.add("柳岩");
        list.add("高圆圆");
        list.add("赵又廷");
        System.out.println(list);



        //查
        String name = list.get(2);
        System.out.println(name);

        //长度
        int size = list.size();
        System.out.println(size);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
