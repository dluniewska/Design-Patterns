package Konstrukcyjne;

import java.io.IOException;

/**
 * Creational Design Pattern Singleton
 **/

public final class Singleton {

    private static Singleton _instancja;

    public static void main(String[] args) throws IOException {

        Singleton singleton1 = Singleton.zwrocInstancje();
        Singleton singleton2 = Singleton.zwrocInstancje();

        if (singleton1 == singleton2) {
            System.out.println("Są to obiekty tej samej instancji");
        }
        else {
            System.out.println("Nie są to obiekty tej samej instancji");
        }

        System.in.read();
    }

    protected Singleton() {

    }

    public static Singleton zwrocInstancje() {
        if (_instancja == null) {
            _instancja = new Singleton();
        }

        return _instancja;
    }

}
