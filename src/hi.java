import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public interface hi {

    public static void main (String args[]) {

        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};


        HashMap<String , ArrayList<Integer>> album = new HashMap<String , ArrayList<Integer>>();
        HashMap<String , Integer> first = new HashMap<String , Integer>();
        for(int i=0;i<plays.length;i++) {
            if(album.containsKey(genres[i])) {
                album.get(genres[i]).add(plays[i]);
            }
            else {
                album.put(genres[i], new ArrayList<Integer>(Arrays.asList(plays[i])));
            }
        }


        for(String key:album.keySet()) {
            Collections.sort(album.get(key));
            int genrecount = 0;
            for(int i=0;i<album.get(key).size();i++) {
                genrecount += album.get(key).get(i);
            }
            first.put(key, genrecount);
        }


        ArrayList <String> firstgenre = new ArrayList<String>();

        for(String key:album.keySet()) {
            int max = 0;
            String maxkey = "";
            if(first.get(key) > max) {
                max = first.get(key);
                maxkey = key;
            }
            firstgenre.add(maxkey);
            first.remove(maxkey);
        }


        for(int i=0;i<firstgenre.size();i++) {


            if(album.get(firstgenre.get(i)).size() == 1) {
                for(int j=0;j<genres.length;j++) {
                    if(genres[j].equals(firstgenre.get(i))) {
                        System.out.println(j);
                    }
                }
            }

            else {
                for(int index=0;index<2;index++) {
                    for(int j=0;j<genres.length;j++) {
                        if(genres[j].equals(firstgenre.get(i)) && plays[j] == album.get(firstgenre.get(i)).get(album.get(firstgenre.get(i)).size()-1)) {
                            System.out.println(j);
                            album.get(firstgenre.get(i)).remove(album.get(firstgenre.get(i)).size()-1);
                            break;
                        }
                        else if(genres[j].equals(firstgenre.get(i)) && plays[j] == album.get(firstgenre.get(i)).get(album.get(firstgenre.get(i)).size()-2)) {
                            //System.out.println(j);
                        }
                    }
                }
            }


        }



        System.out.println(album);

    }

}