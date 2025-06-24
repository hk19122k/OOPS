class Onepiece
{
	String name;
	int rating;
	String power;
	
     Onepiece(String name, int rating, String power) {
		this.name = name;
		this.rating = rating;
		this.power = power;
	}
     
     void devilfruit()
     {
    	System.out.println("Name: " + name+ " Rating: " + rating + " Power: "+ power); 
     }
	
}

class Zoro extends Onepiece    ///inheritance
{

	Zoro(String name, int rating, String power) {
		super(name, rating, power);
		// TODO Auto-generated constructor stub
	}
	
	void devilfruit()    //// method overriding (runtime polymorphism)
	{
		System.out.println("Name is =  " + name+ " Rating is = " + rating + "Power is = "+ power);
	}
}

class encap                      ////encapsulation with getter and setter with no constructor needed
{
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

abstract class marine            ////abstraction example
{
	abstract void sea();
	 
	void rank()
	{
		System.out.println("World Government");
	}
}

class akainu extends marine          ////exmaple of class extending abstract and implemented methods in abstarct clss
{

	@Override
	void sea() {
	   
		System.out.println("akaninu ice ice devil power");
		
	}
	
}

interface Pirate {
    void loot();                            ////example of interface 
}

interface Swordsman {
    void slash();
}

class Mihawk implements Pirate, Swordsman {         ////class implementing methids inside the interface
    public void loot() {
        System.out.println("Mihawk loots quietly.");
    }

    public void slash() {
        System.out.println("Mihawk slashes with supreme skill.");
    }
}


class Ship {
    String name;
    int speed;
                                                                  //// example of Constructor Overloading
    Ship() {
        this.name = "Default Ship";
        this.speed = 10;
    }

    Ship(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    void display() {
        System.out.println("Ship: " + name + " Speed: " + speed);
    }
}


class Crew {                                                               ////Static method and static keyword example
    static int t = 0;  // Shared among all objects         
    String mem;

    Crew(String name) {
        mem = name;
        t++;  // Increases every time a new Crew member is created
    }

    static void showTotalMembers() {
        System.out.println("Total Crew Members: " + t);
    }
}

class FinalExample {                                    //final keyword example it cant be changed
    final int maxPower = 100;

    void showPower() {
      //   maxPower = 200; // ❌ Error: final variable can't be changed
        System.out.println("Max Power: " + maxPower);
    }
}



public class OOPS {
      public static void main(String[]args)
      {
//    	Onepiece o =  new Onepiece("Luffy" , 10 ,"Gomu - Gomu noh");     /// class and objects example
//    	Onepiece o1 = new Zoro("Zoro yar",9,"Three style technique");    /// inheritance , runtime polymorphism
//    	o.devilfruit();
//    	o1.devilfruit();
    	  
//    	encap e = new encap();                                 /////examples of getter and setter (encapsulation)
//    	e.setName("Vinsmoke Sanji");
//    	e.setBounty("1.3 billion berries");
//    	System.out.println("Name: " + e.getName());
//    	System.out.println("Bounty: "+e.getBounty());
 
//         akainu a =  new akainu();            // called using concrete class (inhertied class) as we cant create obj for abstract
//         a.sea();                             .// becoz abstract class , objects cant be created so we use concrete methods to call it
//         a.rank();

    	  
//    	  Mihawk m =  new Mihawk();                                     /// example of interface
//    	  m.loot();                                        
//    	  m.slash(); 	  
    	  
//    	  Ship s = new Ship();              /calling only constructor without parameters
//    	  s.display();                        called CONSTRUCTOR OVERLOADING            
//    	  
//    	  Ship s1 = new Ship("ronaldo",99);  //calling constructor with parameters
//    	  s1.display();

    	  
//    	  Crew c = new Crew("zoro");
//    	  Crew c1 = new Crew("phoenix");
//    	  Crew c2 = new Crew("bonclay");
//    	  Crew.showTotalMembers();                 static methods are being called by class not by objects
  
	
//    	  FinalExample f = new FinalExample(); 
//    	  f.showPower();                                final keyword example
    	  
    	  
      }
}
