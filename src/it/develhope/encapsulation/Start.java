package it.develhope.encapsulation;
import java.util.Scanner;
public class Start {
    public static void main(String[] args) {
        House house = new House();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of floors:");
        int floorsNumber = scanner.nextInt();
        house.setFloorsNumber(floorsNumber);

        scanner.nextLine();

        System.out.println("Enter the address:");
        String address = scanner.nextLine();
        house.setAddress(address);

        System.out.println("Enter the residents names separated by a comma:");
        String residentsNamesInput = scanner.nextLine();
        String[] residentsNames = residentsNamesInput.split(",");
        house.setResidentsNames(residentsNames);


       System.out.println(String.format("This house has %d floors, is located at %s and is occupied by %s.",
       house.getFloorsNumber(),
       house.getAddress(),
       String.join(", ",
       house.getResidentsNames())));

    }
}
