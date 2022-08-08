package before;

public class linkedlist<T> {

    class Node<T>{
        int data;
        Node next = null;

        public Node(int data) {
            this.data = data;
        }
    }

    public Node<T> head = null;

    public void addNode(int data){

//        int data = this.data;

        if(head == null){
            head = new Node<T>(data);
        }
        else{
            System.out.println("check");
            Node curr = this.head;
            while(curr.next != null){
                curr = curr.next;
            }

            curr.next = new Node<T>(data);
        }

    }
    public void printAll(){
        Node curr = this.head;


        while(curr.next != null){
            curr = curr.next;
            System.out.println(curr.data);

        }

    }
//    public void search(){
//
//    }

    public static void main(String[] args) {

        linkedlist<Integer> a = new linkedlist<Integer>();

        a.addNode(1);
        a.addNode(2);
        a.addNode(3);

        a.printAll();


    }

}


//    public void addNode(T data) {
//        if(head == null) {
//            this.head = new Node<T>(data);
//            this.tail = this.head;
//        }
//        else {
//            Node<T> node = this.head;
//            while (node.next != null) {
//                node= node.next;
//            }
//            node.next = new Node<T>(data);
//            node.next.prev = node;
//            this.tail = node.next;
//        }
//    }