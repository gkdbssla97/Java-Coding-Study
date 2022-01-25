package bookShelf;

public class bookTest {
    public static void main(String[] args) {
        Queue shelf = new bookShelf();
        shelf.enqueue("가");
        shelf.enqueue("나");
        shelf.enqueue("다");
        System.out.println(shelf.dequeue());
        System.out.println(shelf.dequeue());

    }
}
