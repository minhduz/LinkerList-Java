public class MyNode<T> { //Singly Node
     T data;
     MyNode<T> next; // the reference value of the next Node

    public MyNode(T data) { //constructor to create a separate Node
        this.data = data;
        this.next = null;
    }

    public static void main(String[] args) {
        MyNode<Integer> one = new MyNode<>(9);
        MyNode<Integer> two = new MyNode<>(7);
        MyNode<Integer> three = new MyNode<>(10);

        one.next = two;
        two.next = three;

        

        //Test

        System.out.println(three.data);
        System.out.println(one.next.next.data);
    }
}
