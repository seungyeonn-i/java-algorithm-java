package before;

import java.util.*;


public class a {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("입력:");
        String change = scanner.next();
        String input = change.toUpperCase();


        HashMap<Character , Integer> hashmap = new HashMap<Character , Integer>();

        for(int i=0;i<input.length();i++) {
            if(hashmap.containsKey(input.charAt(i)) == true) {
                int value = hashmap.get(input.charAt(i));
                hashmap.put(input.charAt(i),++value);
            }
            else {
                hashmap.put(input.charAt(i), 1);
            }
        }
////
////        ArrayList<> array = hashmap.values().toArray();
//        int count=0;
////        for(int i=0;i<array.size();i++){
////            if(hashmap.Collections.max(hashmap.values()).equals(array.get(i)))
////                count ++;
//        }
//
//        if(count > 0){
//            System.out.println("?");
//        }else{
//            System.out.println( Collections.max(hashmap.values()) );
//
//        }
//
//        scanner.close();
    }

}