package reflection.breaking.singleton;


public class Singleton {

     private static class  SingletonHelper{
         private static final Singleton INSTANCE = new Singleton();
    }
    public Singleton getInstance(){
         return SingletonHelper.INSTANCE;
    }
}
