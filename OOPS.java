// ✅ Class Example with Constructor
class Onepiece {
    String name;
    int rating;
    String power;

    // Constructor for class Onepiece
    Onepiece(String name, int rating, String power) {
        this.name = name;
        this.rating = rating;
        this.power = power;
    }

    // Normal method
    void devilfruit() {
        System.out.println("Name: " + name + " Rating: " + rating + " Power: " + power);
    }
}

// ✅ Inheritance + Method Overriding (Runtime Polymorphism)
class Zoro extends Onepiece {

    Zoro(String name, int rating, String power) {
        super(name, rating, power); // Call parent constructor
    }

    // Method overriding (Polymorphism)
    void devilfruit() {
        System.out.println("Name is = " + name + " Rating is = " + rating + " Power is = " + power);
    }
}

// ✅ Encapsulation using Getters and Setters
class encap {
    private String name;
    private String bounty;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBounty() {
        return bounty;
    }

    public void setBounty(String bounty) {
        this.bounty = bounty;
    }
}

// ✅ Abstraction using Abstract Class
abstract class marine {
    abstract void sea(); // Abstract method (must be implemented)

    void rank() {
        System.out.println("World Government");
    }
}

// ✅ Concrete class extending abstract class
class akainu extends marine {
    @Override
    void sea() {
        System.out.println("akainu ice ice devil power");
    }
}

// ✅ Interface Example
interface Pirate {
    void loot(); // Method without body
}

interface Swordsman {
    void slash();
}

// ✅ Class implementing multiple interfaces
class Mihawk implements Pirate, Swordsman {
    public void loot() {
        System.out.println("Mihawk loots quietly.");
    }

    public void slash() {
        System.out.println("Mihawk slashes with supreme skill.");
    }
}

// ✅ Constructor Overloading Example
class Ship {
    String name;
    int speed;

    // Default constructor
    Ship() {
        this.name = "Default Ship";
        this.speed = 10;
    }

    // Parameterized constructor
    Ship(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    void display() {
        System.out.println("Ship: " + name + " Speed: " + speed);
    }
}

// ✅ Static Keyword Example
class Crew {
    static int t = 0; // Shared variable across all objects
    String mem;

    Crew(String name) {
        mem = name;
        t++; // Count of total crew members
    }

    // Static method can be called without object
    static void showTotalMembers() {
        System.out.println("Total Crew Members: " + t);
    }
}

// ✅ Final Keyword Example
class FinalExample {
    final int maxPower = 100; // Value can't be changed

    void showPower() {
        // maxPower = 200; ❌ Error if uncommented
        System.out.println("Max Power: " + maxPower);
    }
}

// ✅ Main Class
public class OOPS {
    public static void main(String[] args) {

        // ✅ Class and Object
//        Onepiece o = new Onepiece("Luffy", 10, "Gomu - Gomu noh");
//        Onepiece o1 = new Zoro("Zoro yar", 9, "Three style technique");
//        o.devilfruit();
//        o1.devilfruit();

        // ✅ Encapsulation
//        encap e = new encap();
//        e.setName("Vinsmoke Sanji");
//        e.setBounty("1.3 billion berries");
//        System.out.println("Name: " + e.getName());
//        System.out.println("Bounty: " + e.getBounty());

        // ✅ Abstraction
//        akainu a = new akainu();
//        a.sea();
//        a.rank();

        // ✅ Interfaces
//        Mihawk m = new Mihawk();
//        m.loot();
//        m.slash();

        // ✅ Constructor Overloading
//        Ship s = new Ship();
//        s.display();
//
//        Ship s1 = new Ship("ronaldo", 99);
//        s1.display();

        // ✅ Static Example
//        Crew c = new Crew("zoro");
//        Crew c1 = new Crew("phoenix");
//        Crew c2 = new Crew("bonclay");
//        Crew.showTotalMembers();

        // ✅ Final Keyword
//        FinalExample f = new FinalExample();
//        f.showPower();
    }
}
