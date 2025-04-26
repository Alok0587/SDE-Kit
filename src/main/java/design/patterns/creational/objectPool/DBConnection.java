package design.patterns.creational.objectPool;

/*
Example object will be used implement pool
 */
public class DBConnection {

    String name;
    Object properties;

    public DBConnection(String name) {
        this.name = name;
    }

    public void setProperties(Object properties) {
        this.properties = properties;
    }
    public String getProperties() {
        return this.name+":"+"properties:"+"DB properties:"+this.properties;
    }
}
