package cn.school.thoughtworks.section1;

import java.util.*;

public class PracticeA {
    List<String> collectSameElements(List<String> collection1, List<String> collection2) {
        //实现练习要求，并改写该行代码。
        List<String> arrayList1 = new ArrayList<String>(collection1);
        List<String> arrayList2= new ArrayList<String>(collection2);
        arrayList1.retainAll(arrayList2);
        return arrayList1;
    }
    public static void main(String[] args){
        List<String> collection1 = Arrays.asList("a", "e", "h", "t", "f", "c", "g", "b", "d");
        List<String> collection2 = Arrays.asList("a", "d", "e", "f");
        List<String> arrayList1 = new ArrayList<String>(collection1);
        List<String> arrayList2= new ArrayList<String>(collection2);
        arrayList1.retainAll(arrayList2);
        System.out.print(arrayList1);
    }
}
