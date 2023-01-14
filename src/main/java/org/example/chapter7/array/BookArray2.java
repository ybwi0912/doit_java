package org.example.chapter7.array;

public class BookArray2 {
    public static void main(String[] args) {
        Book[] library = new Book[5];

        library[0] = new Book("aaa", "AAA");
        library[1] = new Book("bbb", "BBB");
        library[2] = new Book("ccc", "CCC");
        library[3] = new Book("ddd", "DDD");
        library[4] = new Book("eee", "EEE");

        for(int i=0; i< library.length; i++){
            library[i].showBookInfo();
        }

        for (int i=0; i<library.length; i++){
            System.out.println(library[i]);
        }
    }

}
