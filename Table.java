package lab;
import java.util.*;
public class Table {
	static Scanner sc = new Scanner(System.in);
	public static void main(String args[]) {
		System.out.print("Enter Number:");
		int a = sc.nextInt();
		System.out.println("Table Of "+a);
		for(int i=1;i<11;i++) {
			System.out.println(a+" * "+ i +" = "+a*i);
		}
	}
}
