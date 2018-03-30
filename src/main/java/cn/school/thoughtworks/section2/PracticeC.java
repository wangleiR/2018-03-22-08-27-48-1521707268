package cn.school.thoughtworks.section2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        List<String> arrayList1 = new ArrayList<String>(collection1);
        Map<String, Integer> map = new HashMap<>();
        for (String str:arrayList1) {
            if(str.contains("-") || str.contains(":") || str.contains("[")){
                String[] strList = strSplit(str);
                if (map.containsKey(strList[0])){
                    map.put(strList[0],map.get(strList[0])+Integer.valueOf(strList[1]));
                }else{
                    map.put(strList[0],Integer.valueOf(strList[1]));
                }

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
    public  String[]  strSplit(String str){
        String[]  strList = null;
        if(str.contains("-") ) {
            strList = str.split("-");
        }else if(str.contains(":")){
            strList = str.split(":");
        }else if(str.contains("[")){
            str = str.replace(']',' ');
            str = str.replace('[',':');
            strList = str.split(":");
        }
        return strList;
    }

//    public static void main(String[] args){
//        String str = "h[5]";
//        for (String s:strSplit(str)) {
//            System.out.print(s+"   ");
//        }
//
//    }
}
