package hello2;

import java.util.Scanner;

public class Array {
static Scanner sc = new Scanner(System.in); 
	
private static void input(String[] arr1 ){
	  
 
	for (int i = 0 ; i < arr1.length ; i++)
		 {
		      //arr1[i] = sc.nextLine();
			  //System.out.print("문자를 입력하세요 . : "+ sc.next());  
			  System.out.println("문자열을 입력하세요 . : "); 
		    arr1[i]= sc.next();
		 }

	 }
private static void output(String[] arr1){
	
	for (int i = 0 ; i<arr1.length ; i++)
	 {
		 
		 System.out.println(arr1[i]);
		 
		 
	 }

}


public static void main(String[] args) {
	int num ;
	System.out.print("몇개의 문자를입력할지 결정하세요 !: ");	
	num = sc.nextInt();
	
	String [] arr1 = new String[num];
	input(arr1); 
    output(arr1);
    System.out.println("안녕");
	
 //arr1[0] = sc.nextLine();

 
 
  


}


}
  

  
	

