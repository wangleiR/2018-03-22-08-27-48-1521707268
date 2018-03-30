package cn.school.thoughtworks.section3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        List<String> arrayList1 = new ArrayList<String>(collectionA);
        Map<String, Integer> map = new HashMap<>();
        for (String str:arrayList1) {
            if (!map.containsKey(str)){
                map.put(str,1);
            }else{
                map.put(str,map.get(str)+1);
            }
        }
        List<String> list = object.get("value");
        for (String s : list) {
            if(map.containsKey(s)){
                int m = map.get(s)/3;
                map.put(s,map.get(s)-m);
            }
        }
        return map;

    }
}
