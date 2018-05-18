package ch.noser.modul.top.level;

import ch.noser.modul.base.Service;

import java.util.ServiceLoader;

public class Test {
    public static void main(String[] args) {
        System.out.println("Hello from b.Test");

        ServiceLoader.load(Service.class).iterator()
                .forEachRemaining(Test::printService);

        ch.noser.modul.base.a.Test.main(args);
        ch.noser.modul.base.b.Test.main(args);
    }

    private static void printService(Service s) {
        System.out.println(s.getClass().toString()+"("+s.hashCode()+")" + ": " + s.getName());
    }
}
