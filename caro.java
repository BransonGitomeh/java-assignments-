 import java.util.Scanner;

//this is the main assignment

class Monogram{
  public static void main(String[] args) {

    //declaring character variables
    String firstInitial,secondInitial,thirdInitial,result,resultTwo;
    //making an object to get input
    Scanner sc = new Scanner(System.in);

    //logic
    System.out.println("enter first initial");
    firstInitial = sc.nextLine();
    System.out.println("enter second initial");
    secondInitial = sc.nextLine();
    System.out.println("enter the third initial");
    thirdInitial = sc.nextLine();

//calling the method
    printInitials(firstInitial,secondInitial,thirdInitial);
  }
  //declaring the method

    static void printInitials(String firstInitial,String secondInitial,String thirdInitial){
      String result = "your initials are " + firstInitial + " " + secondInitial + " " + thirdInitial;
      String resultTwo = "your initials in traditional monogram style are " + firstInitial + " " + thirdInitial + " " + secondInitial;
      System.out.println(result);
      System.out.println(resultTwo);
    }

}
