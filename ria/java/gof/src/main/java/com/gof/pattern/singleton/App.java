package com.gof.pattern.singleton;

import java.io.*;
import java.lang.reflect.InvocationTargetException;

public class App {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException {
        /** 새로 만들어진 인스턴스는 같지 않음 **/
        /*Settings settings = new Settings();
        Settings settings1 = new Settings();
        System.out.println(settings != settings1); // true*/

        /** 매번 같은 인스턴스를 반환함 **/
        /*Settings1 settings = Settings1.getInstance();
        System.out.println(settings == Settings1.getInstance()); // true*/

        /** 리플렉션 사용 -> 싱글톤을 깨뜨리는 방법1 / 대응 불가능 **/
        /*Settings5 settings5 = Settings5.getInstance();
        Constructor<Settings5> constructor = Settings5.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Settings5 settings55 = constructor.newInstance();
        System.out.println(settings5 == settings55); // false */

        /*Settings5 settings555 = null;*/
        /** 직렬화 -> 싱글톤을 깨뜨리는 방법2 / readResolve()로 대응 가능 **/
        /*try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
            out.writeObject(settings5);
        }*/
        /** 역직렬화 **/
        /*try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
            settings555 = (Settings5) in.readObject();
        }
        System.out.println(settings5 == settings555); // false, readResolve() 호출 시 true*/

        /** enum 사용 -> 싱글톤에 안전함 **/
        /*Settings6 settings6 = Settings6.INSTANCE;
        Settings6 settings66 = null;
        Constructor<?>[] declaredConstructors = Settings6.class.getDeclaredConstructors();
        for (Constructor<?> constructor : declaredConstructors) {
            constructor.setAccessible(true);
            settings66 = (Settings6) constructor.newInstance("INSTANCE");
        }
        System.out.println(settings6 == settings66); // IllegalArgumentException*/

        Settings6 settings6 = Settings6.INSTANCE;
        Settings6 settings66 = null;
        /** 직렬화 **/
        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
            out.writeObject(settings6);
        }
        /** 역직렬화 **/
        try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
            settings66 = (Settings6) in.readObject();
        }
        System.out.println(settings6 == settings66); // true
        Settings1 settings = Settings1.getInstance();
        System.out.println(settings == Settings1.getInstance()); // true
    }
}