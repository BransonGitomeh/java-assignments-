import java.util.Scanner;


class MyClass
{
    public static void main(String[] args)
     {
	//declare variables that will be used
	int feet, inches, halfHeight, choice;
	Scanner sc = new Scanner(System.in);

	//ask user what he wants the user to enter height as
	System.out.println("what units do you want to use?");
	System.out.println("1 - cm");
	System.out.println("2 - inches");
	System.out.println("3 - feet");

        choice = sc.nextInt();

	//check the input given
	if(choice == 1){
		System.out.println("you seleceted cm");
	}else if(choice == 2){
		System.out.println("you selected inches");
	}else if(choice == 3){
		System.out.println("you selected feet");
	}
	//actual code
	System.out.println("enter your height in feet");
	feet = sc.nextInt();


	System.out.println("enter your height in inches");
        inches = sc.nextInt();

	/**
	*print out the result
	*/
	System.out.println("your height in feet is  " + feet + " your height in inches is " + inches);
     	
	/*
	*ask user for half of height in either feet and inches or centimeters 
	*/
	System.out.println(" ");
	System.out.println("enter half your height,in feet and inches");
        halfHeight = sc.nextInt();
	
	System.out.println("half of your height is " + halfHeight);
	
     }
}
