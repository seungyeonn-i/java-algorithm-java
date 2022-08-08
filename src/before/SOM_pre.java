package before;

import java.util.Scanner;

public class SOM_pre {

        static String buf;
        static char[] input;
        static char[] a,b;
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);

            buf = sc.next();
            input = buf.toCharArray();

            int ainx = 0 ,binx = 0;

            a = new char[input.length];
            b = new char[input.length];

            for(int i=0;i<input.length;i++){
                if(input[i] =='(')
                    a[ainx++] = input[i];
                else if (input[i] == ')')
                    b[binx++] = input[i];

            }

            if(ainx >= binx)
                System.out.println("YES");
            else
                System.out.println("NO");


        }

}
