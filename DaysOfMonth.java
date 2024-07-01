//Implementing java program using switch statements
package apjfsa;
import java.util.*;
public class DaysOfMonth {
	//static method
	static void printMonth(int n) {
		switch(n) {
		case 1:System.out.println(n+" Is January We Have 31 Days");
		break;
		case 2:System.out.println(n+" Is February We Have 28/29 Days");
		break;
		case 3:System.out.println(n+" Is March We Have 31 Days");
		break;
		case 4:System.out.println(n+" Is April We Have 30 Days");
		break;
		case 5:System.out.println(n+" Is May We Have 31 Days");
		break;
		case 6:System.out.println(n+" Is June We Have 30 Days");
		break;
		case 7:System.out.println(n+" Is July We Have 31 Days");
		break;
		case 8:System.out.println(n+" Is August We Have 31 Days");
		break;
		case 9:System.out.println(n+" Is September We Have 30 Days");
		break;
		case 10:System.out.println(n+" Is October We Have 31 Days");
		break;
		case 11:System.out.println(n+" Is November We Have 30 Days");
		break;
		case 12:System.out.println(n+" Is December We Have 31 Days");
		break;
		default:System.out.println("INVALID");
		
		}
	}
              //mean method
	public static void main(String[] args) { 
          //instace variable
		int a;
		System.out.println("Enter A Month Nomber :");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		printMonth(a);
		
		

	}

}
