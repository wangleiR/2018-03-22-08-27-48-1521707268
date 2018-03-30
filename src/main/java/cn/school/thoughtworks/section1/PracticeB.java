package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;

public class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
        //实现练习要求，并改写该行代码。
        List<String> arrayList1 = new ArrayList<String>(collection1);
        List<List<String>> arrayList2= new ArrayList<List<String>>(collection2);
        for (List<String> list:arrayList2) {
            arrayList1.retainAll(list);
        }
        //arrayList1.retainAll(arrayList2);
        return arrayList1;
    }
}
