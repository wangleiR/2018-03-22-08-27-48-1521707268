package cn.school.thoughtworks.section2;

import java.util.*;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        List<String> arrayList1 = new ArrayList<String>(collection1);
        Map<String, Integer> map = new HashMap<>();
        for (String str:arrayList1) {
            if(str.contains("-") || str.contains(":") || str.contains("[")){
                String[] strList = strSplit(str);
                if (map.containsKey(strList[0])){
                    int count = map.get(strList[0])+Integer.valueOf(strList[1].trim());
                    map.put(strList[0],count);
                }else{
                    map.put(strList[0],Integer.valueOf(strList[1].trim()));
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
    public  static String[]  strSplit(String str){
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

    public static void main(String[] args){
        String str = "h[3]";
        List<String> collection1 = Arrays.asList(
                "a", "a", "a",
                "e", "e", "e", "e", "e", "e", "e",
                "h", "h", "h", "h", "h", "h", "h[3]", "h", "h",
                "t", "t-2", "t", "t", "t", "t", "t", "t", "t[10]",
                "f", "f", "f", "f", "f", "f", "f", "f", "f",
                "c:8",
                "g", "g", "g", "g", "g", "g", "g",
                "b", "b", "b", "b", "b", "b",
                "d-5"
        );
        for (String s:strSplit(str)) {
            System.out.print(s+"   ");
        }

    }
}
