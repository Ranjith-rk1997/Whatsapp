package LogicPrograms;

public class Factorial {

	public static void main(String[] args) {
		int num=5 ,i=1,fact=1;
		while(i<=num) {
			fact=fact*i;
			i++;
		}
System.out.println("The factorial of the given number is :"+fact);
	}

}
