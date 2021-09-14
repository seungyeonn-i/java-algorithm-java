import java.util.*;

public class OpenChat {

    public static void main(String[] args) {
        String[] record = {"Enter uid1234 Muzi",
                "Enter uid4567 Prodo",
                "Leave uid1234",
                "Enter uid1234 Prodo",
                "Change uid4567 Ryan"};
        solution(record);
    }

    static String[] solution(String[] record) {
        Stack<String> stack = new Stack<>();
        List<dummy> list = new ArrayList<>();


        Map<String, String> map = new HashMap<>();

        for (int i = 0; i < record.length; i++) {
            if (record[i].contains("Enter") || record[i].contains("Change")) {

                String[] array = record[i].split(" ");
                array[1] = array[1].replaceAll("[^0-9]", "");
                map.put(array[1], array[2]);
                if(record[i].contains("Enter")){
                    list.add(new dummy(array[1],"들어왔습니다."));
                }


            } else if (record[i].contains("Leave")) {
                String[] array = record[i].split(" ");
                array[1] = array[1].replaceAll("[^0-9]", "");

                for (String key : map.keySet()) {

                    if (key.equals(array[1])) {
                        map.put(array[1], " ");
                        list.add(new dummy(array[1],"나갔습니다."));

                    }
                }
            }

        }
        String [] answer = new String[list.size()];

        for(int i=0;i<list.size();i++){

            answer[i] = map.get(list.get(i).uid) + "님이 " + list.get(i).entrance;
            System.out.println(answer[i]);
        }
        return answer;

    }
}
class dummy{
    String entrance;
    String uid;
    dummy(String uid,String entrance){
        this.entrance = entrance;
        this.uid = uid;
    }
}


