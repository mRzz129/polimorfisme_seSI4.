class Benua {
    void display() {
        System.out.println("Ini adalah sebuah benua.");
    }
}

// Kelas Bumi yang merupakan turunan dari kelas Benua
class Bumi extends Benua {
    // Overriding method display dari kelas Benua
    @Override
    void display() {
        System.out.println("Ini adalah planet Bumi.");
    }

    // Method overloading dengan parameter negara
    void display(String negara) {
        System.out.println("Negara " + negara + " berada di planet Bumi.");
    }
}

// Kelas Negara yang juga merupakan turunan dari kelas Benua
class Negara extends Benua {
    // Method overloading dengan parameter nama negara dan benua
    void display(String negara, String benua) {
        System.out.println("Negara " + negara + " berada di benua " + benua + ".");
    }
}

public class Benuaa {
    public static void main(String[] args) {
        Benua benua = new Benua();
        Bumi bumi = new Bumi();
        Negara negara = new Negara();

        // Polimorfisme menggunakan overriding
        benua.display(); // Output: Ini adalah sebuah benua.
        bumi.display(); // Output: Ini adalah planet Bumi.

        // Polimorfisme menggunakan overloading
        bumi.display("Indonesia"); // Output: Negara Indonesia berada di planet Bumi.
        negara.display("Indonesia", "Asia"); // Output: Negara Indonesia berada di benua Asia.
    }
}