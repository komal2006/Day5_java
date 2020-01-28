import java.util.*;
public class array {
    public static void main(String[] args) {
        //We have two collection of cars, and their prices
        //create 2 arrays, one of car names, and one of their prices. And do following:
        //1. let the user choose how many cars are there
        //2. After entering names and prices of cars let the user enter a car name if found, show its price.
                      //if not found show a message says "the car doesn't exist, enter a another car name"
        //3. Give the user 2 options:
              // 1. buy the car
             //2. not buy the car. and exit
        //4.if the user wants to buy the car, find the total price after adding 13% as tax.

        //example:
         //carNames=BMW, Toyota,Nissan,Ford, Mazda,GMC
         //carPrices=78000,41000,385000,51250,
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        double price[] = new double[size];
        String carNames[] = new String [size];
        int carPrices[] = new int[size];
        System.out.println("Enter the name of car");
        for(int i=0;i<=size;i++)
        {
             carNames[i] = sc.nextLine();
            System.out.println("car1:" + carNames[i]);

        }
    }
}
