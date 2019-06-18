package itheima.demo7;

import java.util.ArrayList;
import java.util.List;

public class DemoInterface {
    public static void main(String[] args) {
        List<String> list  = new ArrayList<>();

        List<String> result = addNames(list);


    }
    public static List<String> addNames(List<String> list){
        list.add("迪丽热巴");
        list.add("古力娜扎");
        list.add("马尔咋哈");
        return list;
    }
}
