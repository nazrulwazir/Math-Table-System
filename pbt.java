//import java io,lang & util
import java.io.*;
import java.lang.*;
import java.util.*;

class Arithmethic  {//method main

    public static void main(String args []) throws IOException {


		try{
				BufferedReader in=new BufferedReader (new InputStreamReader(System.in)); //for input user
		//declaration
		String repeat;
    	int rep;
		//output
    	System.out.println("\t\t*****************************************\n");
    	System.out.println("\t\t\t MATHEMATIC TABLE SYSTEM \t\t\t\n");
    	System.out.println("\t\t*****************************************\n");

		//looping using do while
		do{
			System.out.println("1.Additional \t2.Subtraction \n3.Division\t4.Multiple \n");//information for user
		//declaration
    	String num;
    	int number;
		//user make decision
    	System.out.print("Enter Your Favourite Mathematic Solution:");
    	num=in.readLine();
    	number=Integer.parseInt(num);
		//will read from input user
    	switch (number)
    	{	//if choose 1
    		case 1:
    			Arithmethic add=new Arithmethic();
    			add.addition();
    			break;
			//if choose 2
    		case 2:
    			Arithmethic sub=new Arithmethic();
    			sub.subtraction();
    			break;
			//if choose 3
    		case 3:
    			Arithmethic div=new Arithmethic();
    			div.division();
    			break;
			//if choose 4
    		case 4:
    			Arithmethic mul=new Arithmethic();
    			mul.multiple();
    			break;
			//if user choose other than that
    		default:
    			System.out.println("Wrong Input !");
    			break;

    	}//ask user want to repeat or not
    	System.out.print("Still want to repeat (1/0)?");
    	repeat=in.readLine();
    	rep=Integer.parseInt(repeat);
		}
		while(rep != 0);//if user input 0 will appear this output
		System.out.println("\t\tExit From Mathematic Table System\n");
		System.out.println("\t\t\tGood Bye !\n");
    }
             catch(NumberFormatException ex) //catch NumberFormatException when user enter unnumeric
			{
				System.out.println("not a numeric");//output
			}
		finally //this is option
		{
			System.out.println("Program will out!Run Again !");//output
		}
	}


void addition ()throws IOException//method for addition
{
		BufferedReader in=new BufferedReader (new InputStreamReader(System.in));
		//output
		System.out.println("\t\t**************************\n");
    	System.out.println("\t\t\t ADDITION ");
    	System.out.println("\t\t**************************\n");

		//declaration
		String number1,number2;
    	int num1,num2,sum;

		//user need to enter the input
    	System.out.print("Enter Your First Number:");
    	number1=in.readLine();
    	num1=Integer.parseInt(number1);
    	System.out.print("Enter Your Second Number:");
    	number2=in.readLine();
    	num2=Integer.parseInt(number2);
		//calculation
		sum=num1+num2;
		//output
    	System.out.println(num1+ "+"+ +num2+ "=" +sum);
}
void subtraction ()throws IOException//method for subtraction
{
		BufferedReader in=new BufferedReader (new InputStreamReader(System.in));
		//output
		System.out.println("\n");
    	System.out.println("\t\t**************************\t\t");
    	System.out.println("\t\t\t SUBTRACTION ");
    	System.out.println("\t\t**************************\t\t");
    	System.out.println("Note:First Number MUST Greater than second number");
		//declaration
    	String subt1,subt2;
    	int sub1,sub2,sub;

		//user need to enter the input
    	System.out.print("Enter Your First Number:");
    	subt1=in.readLine();
    	sub1=Integer.parseInt(subt1);
    	System.out.print("Enter Your Second Number:");
    	subt2=in.readLine();
    	sub2=Integer.parseInt(subt2);
		//calculation
    	sub=sub1-sub2;
		//output
    	System.out.println(sub1+ "-"+ +sub2+ "=" +sub);
}
void division ()throws IOException //method for division
{
		BufferedReader in=new BufferedReader (new InputStreamReader(System.in));
		//output
		System.out.println("\n");
		System.out.println("\t\t**************************\t\t");
    	System.out.println("\t\t\t DIVISION ");
    	System.out.println("\t\t**************************\t\t");
    	System.out.println("Note:Second Number Cannot be Zero");
		//declaration
		String divi1,divi2;
    	double div1,div2;
    	double division;
		//use exception handling to fix error from user
		try{
		//user need to enter the input

    	System.out.print("Enter Your First Number:");
    	divi1=in.readLine();
    	div1=Double.parseDouble(divi1);
    	System.out.print("Enter Your Second Number:");
    	divi2=in.readLine();
    	div2=Double.parseDouble(divi2);


    	 if (div2 != 0) //if user enter not divide by 0
    	 	{
                division =  div1 / div2;
                System.out.println(div1+ "/"+ +div2+ "=" +division);
            }
            	else{
            throw new ArithmeticException ();//if user enter 0,it will be throw to catch (ArithmeticException)
    }
		}
		catch (ArithmeticException e) {
            System.out.println("Sorry Division By Zero Is Not Possible");//catch ArithmeticException when user enter 0
        }
             catch(NumberFormatException ex) //catch NumberFormatException when user enter unnumeric
			{
				System.out.println("not a numeric");//output
			}
		finally //this is option
		{
			System.out.println("Completed !");//output
		}

}
void multiple ()throws IOException //method for multiplication
{
		BufferedReader in=new BufferedReader (new InputStreamReader(System.in));
		//output
		System.out.println("\n");
		System.out.println("\t\t**************************\t\t");
    	System.out.println("\t\t\t MULTIPLE ");
    	System.out.println("\t\t**************************\t\t");

		//declaration
    	String multiple1;
    	int mult1;

		//user need to enter the input
    	System.out.print("Enter Your Favourite Number :");
    	multiple1=in.readLine();
    	mult1=Integer.parseInt(multiple1);
		//calculation
		System.out.println("\n");
		for (int i = 1; i <= 12; i++) {//using for loop
            System.out.println(i + "x"+ +mult1+ "="  + (i * mult1) + "\t");
        }
        System.out.println();
    	}
}