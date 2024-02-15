public class MyLinkerList<T> {
    private MyNode<T> head;
    private int size;

    public MyLinkerList() {
        this.head = null;
        this.size = 0;
    }

    public void add(T data) {
        MyNode<T> newNode = new MyNode<>(data);
        if (head == null) {
            head = newNode;
        } else {
            MyNode<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    /*
    Best Case: O(1) (nếu danh sách rỗng, chỉ cần thêm vào head).
    Worst Case: O(n) (nếu phải duyệt qua toàn bộ danh sách để đến phần tử cuối cùng).
     */

    public void addAtIndex(int index, T data) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        MyNode<T> newNode = new MyNode<>(data);
        if (index == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            MyNode<T> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
        size++;
    }

    /*
    Best Case: O(1) (nếu chèn vào đầu danh sách).
    Worst Case: O(n) (nếu chèn vào vị trí giữa danh sách và phải duyệt đến vị trí cần chèn).
     */


}
