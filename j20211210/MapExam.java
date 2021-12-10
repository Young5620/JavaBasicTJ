package j20211210;

import java.util.HashMap;

public class MapExam {
    public static void main(String[] args) {
        
        //파이썬의 딕셔너리 판다스의 Series JS의 json과 같은 키와 밸류 쌍으로 이루어진 자료형
        //오직 키값으로 밸류값을 얻는다. 순서(index)의 개념이 없다.

        HashMap<String, String> map = new HashMap<>();
        map.put("people", "person");
        map.put("baseball", "ball");

        System.out.println(map.get("people"));
        System.out.println(map.size());
    }
    
}
