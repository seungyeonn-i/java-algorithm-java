class HashardNum {
    public boolean solution(int x) {
        boolean answer = false;
        int h = 0 ;
        int num = x;


        while(num!=0){
            h += num%10;
            num/=10;
            System.out.println(h);

        }


        if(x%h == 0)
            answer = true;
        return answer;
    }
}