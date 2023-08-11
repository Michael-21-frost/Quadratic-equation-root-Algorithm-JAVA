import java.util.Scanner;
import static java.lang.Math.*;
public class QuadraticEquation{
    public static void main(String[] args) {
        String choice, data;
        Scanner input =new Scanner(System.in);
        //loop to re-run the program by users choice
        while(true){
            equation();
			System.out.println("Do you want to run this program again?");
            choice=input.nextLine();
			switch(choice){
				case "yes":
				equation();
				continue;
				case "no":
				break;
			}
			break;
    }
		}
        //the quadratic formular 
        static void equation(){
            	//declaring variables 
   int a, b, c,  firstRoot, secondRoot;
   double disc;
   Scanner input=new Scanner(System.in);
   	   System.out.println("Enter cofficients of a: ");
        a=input.nextInt();
        System.out.println("Enter cofficients of b: ");
        b=input.nextInt();
        System.out.println("Enter cofficients of c: ");
        c=input.nextInt();
     

     //discriminant
     disc = sqrt((b*b) - (4*a*c)); 
     // given the discriminant is a real number
   if( disc>0 ) 
   {                                      
   	//perform the evaluation
     firstRoot = (int) ((-b+disc) / (2*a));
     secondRoot = (int) ((-b-disc) /( 2*a));
     System.out.println(" Equation Roots are X=" +firstRoot +" X="+ secondRoot);
   }
   else
   {
     	//perform the evaluation
       firstRoot = (int) ((-b+disc) / (2*a));
       secondRoot = (int) ((-b-disc) /( 2*a));
     System.out.print("Equation Roots are  X=" + firstRoot +" X="+ secondRoot);
     System.out.println(" #WARNING NUMBERS ARE NOT REAL!!\n"); 	
   }

            

        
        
    }
}
//this code was wrritten by michael otote for YCT project assignment 