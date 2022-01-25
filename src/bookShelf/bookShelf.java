package bookShelf;

import java.util.ArrayList;

public class bookShelf extends Shelf implements Queue{
    @Override
    public void enqueue(String title) {
        shelf.add(title);
    }

    @Override
    public String dequeue() {
        return shelf.remove(0);
    }

    @Override
    public int getSize() {
        return getCnt();
    }
}
