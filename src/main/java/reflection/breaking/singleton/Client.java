package reflection.breaking.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class Client {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Class singletonClass = Class.forName("reflection.breaking.singleton.Singleton");

        //check how it's accessed  using $
        Class<?> singletonHelperClass = Class.forName("reflection.breaking.singleton.Singleton$SingletonHelper");

        Field instanceZField=singletonHelperClass.getDeclaredField("INSTANCE");
        instanceZField.setAccessible(true);
        System.out.println("Instance Z Field: "+instanceZField);

        Constructor constructor = singletonClass.getDeclaredConstructor();
        constructor.setAccessible(true);

        Object instance = constructor.newInstance();
        Singleton singleton = (Singleton) instance;


        /*
        This will fail if the field INSTANCE is set as final in SingletonHelper inner class.
        That's why bull pugh method is so famous as it can't be broken with reflection.
         So we set the instance field final in the inner static class.

         Note- to run this class you can remove final from instance variable.(but just to run this class as it's not recommended
         */
        instanceZField.set(null, singleton);

        System.out.println("Instance Z Field2: "+instanceZField);

    }
}
