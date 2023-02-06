import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    /*
    AUTHOR
    Ulrika Eriksson, 2022-05-18

    INTRODUCTION
    An issue tracking system that registers errands and marks if they are solved or unsolved. Through a menu the user
    can choose to create an errand, mark an errand as solved, print list of solved errand or unsolved errands, or exit.
    When a user marks an errand as solved, they are changed to solved from unsolved.

    IMPLEMENTATION
    A menu is printed, through a do-while loop. All the switch choices uses methods in the class ITS, so the Main
    is pretty bare.

    The "create errand" method asks the user to describe the errand which is stored in a string in the class.
    Then the user is asked if the errand is solved or not. An if statement places the errand depending on if it's solved or not.
    These are also stored in an arraylist, called errandArray.

    The "mark as solved" method prints all the errands (with the method printAll) and asks which the user wants to change,
    to type its index, which is also printed. An ITS class object gets the chosen index, and through the setter sets is
    to "true" instead (solved).

    The print solved (and print unsolved) is self-explanatory. A for statement runs through all the errands put in the
    arraylist errandArray, and an if statement prints the ones true or false (depending on method).

    The user can exit the program by choosing the exit choice in the switch list. The do-while loop is set to false
    and the program ends.

    DISCUSSION
    I had quite a struggle to manage this exercise.

    First, the create errand method was mostly in the main. My problem was to manage the arraylist I created. It didn't
    work when I had it in the main, and the rest in the class. I decided to make it more simple for me, to have everything
    in the class, so that I didn't have to send values back and forth.

    My next struggle was to make the user be able to change an errand from unsolved to solved. First, I only printed the
    unsolved errands for the user to choose from using the printUnsolved method, but it made it really hard to understand
    what index the errand had. I decided to make it easier for myself and make a method that printed them all. I would
    like to change this code to print only the unsolved, to make it easier for the user to find what errand they would
    like to change, so they don't have to scan through all the errands.

    I also had the really irritating issue, that the cursor stuck after the "scan.nextInt". It took me a long time to realise
    I had to use scan.nextLine after to make it work properly.

    I have learned a lot in this exercise. The most important is how to create an arrayList and add a class object to it.

     */


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        ITS its = new ITS();


        boolean exit = true;

        //Menu is printed as long as the user hasn't chosen exit.
        do {

            System.out.println("1. Create errand.");
            System.out.println("2. Mark errand as solved.");
            System.out.println("3. Print list of solved errands.");
            System.out.println("4. Print list of unsolved errands.");
            System.out.println("5. Exit program.");

            int answer = scan.nextInt();

            switch (answer) {
                case 1:
                    //Errand is created and the list of errands are printed each time, to show the errands.
                    its.createErrand();
                    its.printAll();
                    break;

                case 2:
                    //All the errands are printed, and the errand chosen is changed.
                    its.printAll();
                    its.changeSolved();
                    break;

                case 3:
                    //All solved are printed
                    its.printSolved();
                    break;
                case 4:
                    //All unsolved are printed
                    its.printUnsolved();
                    break;

                case 5:
                    System.out.println("Thank you for using ITS!");
                    exit = false;
            }


        } while (exit);




    }
}