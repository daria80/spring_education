package aop;

import org.springframework.stereotype.Component;

@Component("uniLibraryBean")
public class UniLibrary{

//    @Override
    public void getBook(Book book) {
        System.out.println("Мы берем книгу из университета " + book.getName());
    }

    public void getMagazine() { System.out.println("Мы берем журнал из университета"); }

//    public String returnBook() {
//        System.out.println("Мы возвращаем книгу");
//        return "OK";
//    }

}

