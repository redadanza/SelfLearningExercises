package JavaExer;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        Field fld[] = Student.class.getDeclaredFields();
        for(Field x : fld)
        {
            System.out.println(x);
        }
    }
}
