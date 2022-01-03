public class p4 {

    public static void main(String[] args) {

        String s = "aaabbaaa";
        solution(s);

    }

    static int[] solution(String s) {
        int[] answer = {};

        CircularQueue cq = new CircularQueue(s.length());
        for(int i=0;i<s.length();i++){
            cq.insert(s);
        }

        return answer;
    }
}

class CircularQueue{
    int front;
    int rear;
    int maxSize;
    Object[] queueArray;

    public CircularQueue(int maxSize){
        this.front = 0;
        this.rear = -1;

        this.maxSize = maxSize+1;
        this.queueArray = new Object[this.maxSize];
    }
    public boolean empty(){
        return (front == rear+1) || (front+maxSize-1 == rear);
    }
    public boolean full(){
        return (rear == maxSize-1) || (front+maxSize-2 == rear);
    }

    public void insert(Object item){
        if(full()) throw new ArrayIndexOutOfBoundsException();

        if(rear == maxSize -1){
            rear = -1;
        }
        queueArray[++rear] = item;
    }
    public Object peek(){
        if(empty()) throw new ArrayIndexOutOfBoundsException();

        return queueArray[front];
    }
    public Object remove(){
        Object item = peek();
        front++;
        if(front == maxSize){
            front = 0;
        }
        return item;
    }
}