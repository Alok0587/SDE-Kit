package design.patterns.solid.LiskovSubsPrinciple.GoodExample;


/*
This is good Example here because Ostrich can be substituted for Bird
 */
public class Ostrich implements Bird {
    public void walk(){
        System.out.println("Ostrich walk");
    }
}
