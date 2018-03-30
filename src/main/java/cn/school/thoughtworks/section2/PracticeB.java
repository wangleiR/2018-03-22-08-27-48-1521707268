package cn.school.thoughtworks.section2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        List<String> arrayList1 = new ArrayList<String>(collection1);
        Map<String, Integer> map = new HashMap<>();
        for (String str:arrayList1) {
            if(str.contains("-")){
                String[] strList = str.split("-");
                map.put(strList[0],Integer.valueOf(strList[1]));
            }else{
                if (!map.containsKey(str)){
                    map.put(str,1);
                }else{
                    map.put(str,map.get(str)+1);
                }
            }
        }
        return map;
    }
}
