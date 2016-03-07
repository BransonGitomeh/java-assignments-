import java.util.Scanner;


class MyClass
{
    public static void main(String[] args)
     {
	//declare variables that will be used
	int feet, inches, halfHeight;
	Scanner sc = new Scanner(System.in);
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
