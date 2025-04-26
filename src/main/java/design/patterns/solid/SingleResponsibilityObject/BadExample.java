package design.patterns.solid.SingleResponsibilityObject;

/*
this is a bad example as we have to perform more than one responsibility
in a single class, so we need to seperate each response with new class;
 */
class Database{
    public void save(){
        System.out.println("Save Database");
    }

    public void load(){
        System.out.println("Load Database");
    }

    public void connection(){
        System.out.println("Connect Database");
    }
}
public class BadExample {

}
