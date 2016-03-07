import java.util.Scanner;


class MyClass
{
    public static void main(String[] args)
     {
	//declare variables that will be used
	int y;
	Scanner sc = new Scanner(System.in);
	//actual code
	System.out.println("enter the value of y");
	/**
	*y will be fed with the result of the object sc, which is an instance of the class Scanner
	*/
	y = sc.nextInt();
	/**
	*print out the result
	*/
	System.out.println("value is " + y);
     }
}
