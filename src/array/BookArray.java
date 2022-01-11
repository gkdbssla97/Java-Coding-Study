package array;

public class BookArray {
    public static void main(String[] args) {
        Book[] library = new Book[5];

        // 책을 가르킬 주소의 자리가 5개 생성
        for(int i = 0; i < library.length; i++) {
            System.out.println(library[i]);
        }
        library[0] = new Book("A","a");
        library[1] = new Book("B","b");
        library[2] = new Book("C","c");
        library[3] = new Book("D","d");
        library[4] = new Book("E","e");

        for(int i = 0; i < library.length; i++)
            library[i].showBookInfo();
    }
}
