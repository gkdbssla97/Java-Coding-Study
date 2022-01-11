package array;

import org.w3c.dom.ls.LSOutput;

public class ObjCopy {
    public static void main(String[] args) {
        Book[] bookArr1 = new Book[3];
        Book[] bookArr2 = new Book[3];

        bookArr1[0] = new Book("A1","a");
        bookArr1[1] = new Book("A1","a");
        bookArr1[2] = new Book("A1","a");

        bookArr2[0] = new Book();
        bookArr2[1] = new Book();
        bookArr2[2] = new Book();
        //인스턴스 따로 생성
        //System.arraycopy(bookArr1,0, bookArr2, 0, 3);

        for(int i = 0; i < bookArr1.length; i++) {
            bookArr2[i].setBookName(bookArr1[i].getBookName());
            bookArr2[i].setAuthor(bookArr1[i].getAuthor());
        } //다른 인스턴스를 가리키도록 깊은 복사를 해야한다
        bookArr1[0].setBookName("AA2");
        bookArr1[0].setAuthor("James");
        bookArr1[0].showBookInfo();
        bookArr2[0].showBookInfo();
        /*bArr1과 bArr2가 같은 주소를 가리키고 있기 때문에
        당연히 둘 다 값의 변경이 됨*/

        String[] strArr = {"JAVA", "Android", "C"};
        for(String s : strArr)
            System.out.println(s);
        int[] arr = {1, 2, 3, 4, 5};
        for(int num : arr)
            System.out.println(num);
    }
}
