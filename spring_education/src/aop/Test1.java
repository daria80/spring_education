package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

//        UniLibrary unilibrary = context.getBean("uniLibraryBean", UniLibrary.class);
//        unilibrary.getBook();
//        unilibrary.getMagazine();
//        SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);
//        schoolLibrary.getBook();


        UniLibrary uniLibrary = context.getBean("uniLibraryBean",UniLibrary.class);
        uniLibrary.returnBook();


        context.close();
    }
}
