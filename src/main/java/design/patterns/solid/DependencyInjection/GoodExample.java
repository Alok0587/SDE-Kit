package design.patterns.solid.DependencyInjection;
class Machine{
    public void Start() {
        System.out.println("Starting Machine");
    }
}

public class GoodExample {
    Machine machine;

    public GoodExample(Machine machine) {
        this.machine = machine;
    }
    public void Start() {
        machine.Start();
    }

    public static void main(String[] args) {
        GoodExample example = new GoodExample(new Machine());
        example.Start();
    }

}
