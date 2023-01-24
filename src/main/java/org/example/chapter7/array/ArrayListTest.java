package org.example.chapter7.array;
import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Book> library = new ArrayList<Book>();

        library.add(new Book("태백산맥", "조정래"));
        library.add(new Book("데미안", "헤르만 헤세"));
        library.add(new Book("우리의 환대", "장희원"));
        library.add(new Book("토지", "박경리"));
        library.add(new Book("어린왕자", "생텍쥐페리"));

        for(int i=0; i<library.size(); i++){
            Book book = library.get(i);
            book.showBookInfo();
        }
        System.out.println( );

        System.out.println("=== 향상된 for문 사용 ===");
        for (Book book : library) {
            book.showBookInfo();
        }
    }
}
