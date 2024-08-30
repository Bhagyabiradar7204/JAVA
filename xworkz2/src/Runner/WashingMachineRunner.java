//Runner Method
package Runner;

import com.java.washingmachine.*;

public class WashingMachineRunner {
    public static void main(String[] args) {
        WashingMachine washingmachine = new WashingMachine();
        System.out.println("Local Variable");
        Megha megha = new Megha();
        megha.details();

        System.out.println("Parameter");
        Laxmi laxmi = new Laxmi();
        laxmi.display(washingmachine);

        System.out.println("Parameter");
        Abhishek abhishek = new Abhishek();
        abhishek.details();


        System.out.println("Return_type");
        Bhumika bhumika = new Bhumika();
        bhumika.buy();

        System.out.println("Local Variable");
        Nayana nayana = new Nayana();
        nayana.shop();
    }

}
