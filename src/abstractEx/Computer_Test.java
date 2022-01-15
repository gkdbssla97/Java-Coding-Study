package abstractEx;

public class Computer_Test {
    public static void main(String[] args) {
        //Computer c1 = new Computer();
        Computer c2 = new Desktop(); // Upcasting
        //Computer c3 = new NoteBook();
        Computer c4 = new MyNoteBook();

        c2.display();
        c4.display();
    }
}
