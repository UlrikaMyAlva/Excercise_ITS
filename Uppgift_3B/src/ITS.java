import java.util.ArrayList;
import java.util.Scanner;

public class ITS {

    Scanner scan = new Scanner(System.in);


    private boolean solved;
    private String errand;


    ArrayList<ITS> errandArray = new ArrayList<>();


    //Method create errand
    public void createErrand() {
        ITS xx = new ITS();

        System.out.println("Please describe your errand.");
        String errand = scan.nextLine();
        xx.setErrand(errand);

        System.out.println("Has your errand been solved? 1. Yes 2. No");
        int YN = scan.nextInt();
        scan.nextLine();

        if (YN == 1) {
            xx.setSolved(true);
        }
        else if (YN == 2 ){
            xx.setSolved(false);
        }

        errandArray.add(xx);


    }


    //Prints the solved errands through a for loop and if statement, that checks if they are true or not and only prints the true ones.
    public void printSolved() {
        ITS outTrue = new ITS();
        for (int i = 0; i < errandArray.size(); i++) {
            outTrue = errandArray.get(i);
            if (outTrue.isSolved() == true) {
                System.out.println(outTrue.getErrand());
                System.out.println(outTrue.isSolved());
            }
        }
    }

    //Only prints falsed, checks through a for loop with an if statement.
    public void printUnsolved() {
        ITS outFalse;
        for (int i = 0; i < errandArray.size(); i++) {
            outFalse = errandArray.get(i);
            if (outFalse.isSolved() == false) {
                System.out.println(outFalse.getErrand());
                System.out.println(outFalse.isSolved());
            }
        }
    }

    //Prints all, and index
    public void printAll() {
        ITS outAll;
        for (int i = 0; i < errandArray.size(); i++) {
            outAll = errandArray.get(i);
            System.out.println("Index: " + i);
            System.out.println(outAll.getErrand());
            System.out.println(outAll.isSolved());
        }
    }

    //changes the errand chosen to true
    public void changeSolved() {
        System.out.println("What errand would you like to mark as solved?");
        ITS outChange = new ITS();
        int marked = scan.nextInt();
        scan.nextLine();
        outChange = errandArray.get(marked);
        outChange.setSolved(true);

    }

    //GETTERS AND SETTERS
    public boolean isSolved() {
        return solved;
    }

    public void setSolved(boolean solved) {
        this.solved = solved;
    }

    public String getErrand() {
        return errand;
    }

    public void setErrand(String errand) {
        this.errand = errand;
    }
}
