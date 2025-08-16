package Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer>al=new ArrayList<>();
        al.add(1);
        al.add(2);
        System.out.println(al);
        al.set(1, 78);
        System.out.println(al);
        // reverse array
        System.out.println(al.reversed());
        

        List<Integer>al2=new ArrayList<>();
        al2.add(3);
        al2.add(4);
        al2.add(4);

        al2.addAll(al);
        System.out.println(al2);
        
        // index
        System.out.println(al2.indexOf(3));
        System.out.println(al2.lastIndexOf(4));

        // sublist
        List<Integer>arrList=al2.subList(1,4);
        // by setting value for arrList it not create copy of original list it make changes in original list itself...so avoid this practice
        arrList.set(0, 100);
        System.out.println(arrList);
        System.out.println(al2);




        // create copy of arraylist
        List<Integer>aList=new ArrayList<>(al);
        aList.add(72);
        System.out.println(aList);

    }
    
}
