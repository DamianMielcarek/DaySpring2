package pl.akademiakodu.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lenovo on 2016-12-06.
 */
public class BookRepository {

    public static List<Book> getExampleBooks(){
        List<Book> books = new ArrayList<>();
        for (int i = 1; i <= 6; i++) {
            books.add(new Book("Książka"+i,"Autor"+i,19.99+i));
        }
        return books;
    }

}
