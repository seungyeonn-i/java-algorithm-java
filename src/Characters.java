// name: Jeong Seung Yeon, id: 20192447, class: Na



import java.io.InputStream;
import java.util.Scanner;

public class Characters {
    char[][] chars;

    Characters(char[][] chars) {

        for(int i=0;i<chars.length;i++) {
            for(int j=0;j<chars[i].length;j++) {
                this.chars[i][j] = chars[i][j];
            }
        }
    }


    void print() {
        for(int i=0;i<chars.length;i++) {
            for(int j=0;j<chars[i].length;j++) {
                System.out.print(chars[i][j]);
            }
            System.out.println();
        }

    }

    int getLineCount() {
        return chars.length;

    }

    int getCharCountAt(int lineIndex) {
        return chars[lineIndex].length;
    }

    char getCharAt(int rowIndex, int columnIndex) {
        return chars[rowIndex][columnIndex];
    }

    ///int compareLines(int lineIndex1, int lineIndex2) {}

    ///void sortLines() {}

    int getCharCount() {
        int count = 0;
        for(int i=0;i<chars.length;i++) {
            for(int j=0;j<chars[i].length;j++) {
                count ++;
            }
        }
        return count;
    }

    char[] to1DArray() {

        int count = 0;


        for(int i=0;i<chars.length;i++) {
            for(int j=0;j<chars[i].length;j++) {
                count ++;
            }
        }

        char [] all = new char [count];

        for(int e=0;e<all.length;e++) {
            System.out.print(all[e]);
        }

        return all;

    }


    ///int getTokenCount(char delimiter) {}

    ///char[][] split(char delimiter) {}


    static Scanner getScanner(InputStream source) {
        char chars[][] = null;

        Scanner scanner = new Scanner(source);

        return scanner;
    }


    static char[][] addRow(char[][] array) {


        int l = array.length;
        l++;
        char [][] chars = new char[l][];

        for(int i=0;i<array.length;i++){
                chars[i] = array[i];
        }

        return chars;

    }

    static char[][] scanLines(Scanner scanner) {
        char[][] chars = new char [0][];


        int count = 0;


        while(scanner.hasNext()) {


            String buf = null;
            buf = scanner.next();
            chars = new char[1][buf.length()];

            for (int i = 0; i < buf.length(); i++) {
                chars[count][i] = buf.charAt(i);
            }

            chars = addRow(chars);
            count ++;

            if (scanner.hasNext() && count != 0) {
                chars = addRow(chars);
            }



            ///
        }


        return chars;
    }



    ///이제 메인

    static void closeScanner(Scanner scanner) {}

    public static void main(String[] args) {
        System.out.println("Input multiple lines:");

        Scanner scanner = getScanner(System.in);

        char[][] input = scanLines(scanner);

        closeScanner(scanner);

        System.out.println("*** the input's finished ***");

        Characters lines = new Characters(input);

        System.out.println("*** print the only field chars of this class ***");
        lines.print();
        System.out.println("*** print the only field chars of this class ***");

        System.out.println("*** line count ***");
        System.out.println(lines.getLineCount());
        System.out.println("*** line count ***");

        System.out.println("*** the number of characters in the 1st line ***");
        System.out.println(lines.getCharCountAt(0));
        System.out.println("*** the number of characters in the 1st line ***");

        System.out.println("*** get the total number of characters ***");
        System.out.println(lines.getCharCount());
        System.out.println("*** get the total number of characters ***");

        System.out.println("*** get the 1st char in the 1st line ***");
        System.out.println(lines.getCharAt(0, 0));
        System.out.println("*** get the 1st char in the 1st line ***");

        System.out.println("*** get the 1D array created from the field chars ***");
        System.out.println(lines.to1DArray());
        System.out.println("*** get the 1D array created from the field chars ***");

        System.out.println("*** compare the 1st line and 2nd line ***");
        System.out.println("*** when the 1st line > the 2nd line, print 1 ***");
        System.out.println("*** when the 1st line = the 2nd line, print 0 ***");
        System.out.println("*** when the 1st line < the 2nd line, print -1 ***");
        ///System.out.println(lines.compareLines(0, 1));
        System.out.println("*** compare the 1st line and 2nd line ***");

        System.out.println("*** sort lines and print***");
        ///lines.sortLines();
        lines.print();
        System.out.println("*** sort lines and print***");

        System.out.println("*** get token count split with delimiter 's' ***");
        ///System.out.println(lines.getTokenCount('s'));
        System.out.println("*** get token count split with delimiter 's' ***");

        System.out.println("*** split the field chars with delimiter 's' ***");
        ///char[][] tokens = lines.split('s');

        ///Characters split = new Characters(tokens);
        ///split.print();
        System.out.println("*** split the field chars with delimiter 's' ***");
    }

}