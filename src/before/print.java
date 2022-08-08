package before;

import java.util.Collections;
import java.util.HashMap;

public class print {

    public static void main(String args[]) {

        int[] imp = {2, 1, 3, 2};
        int location = 2;
        int[] returned = new int[imp.length];

        HashMap<Integer , Integer> hashmap = new HashMap<Integer , Integer>();

        for(int i =0;i<imp.length;i++) {
            hashmap.put(i,imp[i]);
        }



        int arrayIndex = 0;

        int check = 0;

        while(true){

            if(check == imp.length ){
                break;
            }

            check++;

            for(int i = 0;i<imp.length;i++) {

                if(check == imp.length ){
                    break;
                }

                if (hashmap.get(i) == Collections.max(hashmap.values())) {

                    System.out.print("check");
                    System.out.print(" i" + i);
                    System.out.print(" length" + imp.length);
                    System.out.print(" arrayIndex" + arrayIndex);
                    System.out.println(" hashmap.get" + hashmap.get(i));


                    if(arrayIndex == imp.length)
                        break;

                    returned[arrayIndex++] = hashmap.get(i);
                    hashmap.put(i,-1);

                }
            }

        }


        for(int i=0;i<imp.length;i++) {
            System.out.print(hashmap.get(i) + " ");
        }
        System.out.println();
        for(int i=0;i<imp.length;i++) {
            System.out.print(returned[i]+ " ");
        }



    }

}