package Basic_Anudip;

 /* 2.Create one superclass HillStations and three subclasses Manali, 
    Mussoorie, Gulmarg. Subclasses extend the superclass and override its
    location() and famousFor() method. i.call the location() and famousFor()
    method by the Parent class’, i.e. Hillstations class. As it refers to 
    the base class object and the base class method overrides the superclass
    method; the base class method is invoked at runtime. ii.call the 
    location() and famousFor() method by the all subclass’,and print 
    accordingly.
 */

// Superclass HillStations
class HillStations {
    public void location() {
        System.out.println("Location: Hill Station.");
    }

    public void famousFor() {
        System.out.println("Famous for: Scenic beauty.");
    }
}

// Subclass Manali
class Manali extends HillStations {
    @Override
    public void location() {
        System.out.println("Location: Manali, Himachal Pradesh.");
    }

    @Override
    public void famousFor() {
        System.out.println("Famous for: Snow-capped mountains and adventure sports.");
    }
}

// Subclass Mussoorie
class Mussoorie extends HillStations {
    @Override
    public void location() {
        System.out.println("Location: Mussoorie, Uttarakhand.");
    }

    @Override
    public void famousFor() {
        System.out.println("Famous for: Waterfalls and trekking.");
    }
}

// Subclass Gulmarg
class Gulmarg extends HillStations {
    @Override
    public void location() {
        System.out.println("Location: Gulmarg, Jammu and Kashmir.");
    }

    @Override
    public void famousFor() {
        System.out.println("Famous for: Skiing and snowboarding.");
    }
}

// Main Class
public class HillStationDemo {
    public static void main(String[] args) {
        // Using HillStations reference
        HillStations hill;

        // Referencing Manali
        hill = new Manali();
        hill.location();
        hill.famousFor();

        // Referencing Mussoorie
        hill = new Mussoorie();
        hill.location();
        hill.famousFor();

        // Referencing Gulmarg
        hill = new Gulmarg();
        hill.location();
        hill.famousFor();

        // Direct subclass calls
        System.out.println("\nDirect calls:");
        Manali manali = new Manali();
        manali.location();
        manali.famousFor();

        Mussoorie mussoorie = new Mussoorie();
        mussoorie.location();
        mussoorie.famousFor();

        Gulmarg gulmarg = new Gulmarg();
        gulmarg.location();
        gulmarg.famousFor();
        
   /*     Output

        Location: Manali, Himachal Pradesh.
        Famous for: Snow-capped mountains and adventure sports.
        Location: Mussoorie, Uttarakhand.
        Famous for: Waterfalls and trekking.
        Location: Gulmarg, Jammu and Kashmir.
        Famous for: Skiing and snowboarding.

        Direct calls:
        Location: Manali, Himachal Pradesh.
        Famous for: Snow-capped mountains and adventure sports.
        Location: Mussoorie, Uttarakhand.
        Famous for: Waterfalls and trekking.
        Location: Gulmarg, Jammu and Kashmir.
        Famous for: Skiing and snowboarding.
    
     */
        
        
    }
}




