package before;

import java.util.HashMap;

public class p3 {

    public static void main(String[] args) {
        String[] ings = {"r 10", "before.a 23", "t 124", "k 9"};
        String [] menu = {"PIZZA arraak 145", "HAMBURGER tkar 180", "BREAD kkk 30", "ICECREAM rar 50", "SHAVEDICE rar 45", "JUICE rra 55", "WATER before.a 20"};
        String[] sell = {"BREAD 5", "ICECREAM 100", "PIZZA 7", "JUICE 10", "WATER 1"};

        solution(ings,menu,sell);
    }


    static int solution(String[] ings, String[] menu, String[] sell) {
        int answer = 0;
        HashMap<String,Integer> ING_hash = new HashMap<>();
        HashMap<String,Integer> Menu_hashmap = new HashMap<>();


        for(int i=0;i< ings.length;i++){
            String ING = ings[i];

            String [] array = ING.split(" ");

            ING_hash.put(array[0], Integer.parseInt(array[1]));
//            System.out.println(ING_hash.get(array[0]));

        }

        for(int i=0;i<menu.length;i++){
            String Menu = menu[i];
            String[] array = Menu.split(" ");
            String ING_List = array[1];

            int benefit = Integer.parseInt(array[2]) - cal(ING_hash, ING_List);
            Menu_hashmap.put(array[0], benefit);
//
        }

        for(int i=0;i<sell.length;i++){
            String s = sell[i];
            String[] array = s.split(" ");

            answer += Menu_hashmap.get(array[0]) * Integer.parseInt(array[1]);
        }

        System.out.println(answer);


        return answer;
    }

    static public int cal(HashMap ING, String ING_List){

        int value = 0;

        for(int i=0;i<ING_List.length();i++){
            value += (int) ING.get(Character.toString(ING_List.charAt(i)));
        }
        return value;
    }
}

