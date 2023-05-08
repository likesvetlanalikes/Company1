package collection;

import company.Director;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public  static void main(String []args){
        List<Object> arrayList = new ArrayList<>();
        arrayList.add(new User("name", 45));
        arrayList.add(new User("name1", 45));
        arrayList.add(new User("name2", 45));
        arrayList.add(new Director("name2","ewdw", 3));
        arrayList.add(4);
        arrayList.add("4");

        System.out.println(arrayList);
    }
}
