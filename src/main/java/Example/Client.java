package Example;

public class Client implements InterfaceOne, InterfaceTwo {

    @Override
    public String getName(){
        return "Client";
    }

    public static void main(String[] args) {
        InterfaceOne client = new Client();
        System.out.println(client.getName());
    }
}
