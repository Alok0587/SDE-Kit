package design.patterns.creational.builder.Short;

public class Client {
    public static void main(String[] args) {
        Library library=new Library.LibraryBuilder().wthId(123).withLanguage("java").build();
        System.out.println(library);

        Library library1=new Library.LibraryBuilder().wthId(456).withLanguage("python").withName("Python Library").build();

        Library library2=new Library.LibraryBuilder().build();
        System.out.println(library1);

        System.out.println(library2);
    }
}
