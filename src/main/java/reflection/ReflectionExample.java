package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Parameter;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class ReflectionExample {
    public static void main(String[] args) {

        try {

            Class personClass = Class.forName("reflection.Person");


            //accessing it's private constructor
            Constructor<?> constructor = personClass.getDeclaredConstructor(String.class,int.class);
            constructor.setAccessible(true);

            Object personInstance = constructor.newInstance("John Doe", 1);

            Person person = (Person) personInstance;

            System.out.println(":Person"+personInstance);

            //access it's private fields

            Field nameField = personClass.getDeclaredField("name");

            nameField.setAccessible(true);

            nameField.set(person, "John Wick");

            System.out.println(":Person2 ->"+personInstance);

            System.out.println("Updated name ->"+((Person) personInstance).getName());


            Field ageField = personClass.getDeclaredField("age");
            ageField.setAccessible(true);
            ageField.set(person, 20);

            System.out.println(":Person3 ->"+personInstance);


        }catch (Exception e){
              e.printStackTrace();
        }


    }
}
