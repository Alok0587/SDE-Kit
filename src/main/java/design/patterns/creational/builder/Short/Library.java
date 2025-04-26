package design.patterns.creational.builder.Short;

public class Library {

    int id;
    String name;
    String language;

    public Library(LibraryBuilder builder) {
       this.id = builder.id;
       this.name = builder.name;
       this.language = builder.language;
    }
    public static class LibraryBuilder{
        int id;
        String name;
        String language;
        LibraryBuilder() {
        }
        LibraryBuilder wthId(int id){
            this.id = id;
            return this;
        }
        LibraryBuilder withName(String name){
            this.name = name;
            return this;
        }
        LibraryBuilder withLanguage(String language){
            this.language = language;
            return this;
        }
        Library build(){
            return new Library(this);
        }
    }

    @Override
    public String toString() {
        return "Library{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", language='" + language + '\'' +
                '}';
    }
}
