package hello2;

import java.util.Scanner;

public class Array {
static Scanner sc = new Scanner(System.in); 
	
private static void input(String[] arr1 ){
	  
 
	for (int i = 0 ; i < arr1.length ; i++)
		 {
		      //arr1[i] = sc.nextLine();
			  //System.out.print("���ڸ� �Է��ϼ��� . : "+ sc.next());  
			  System.out.println("���ڿ��� �Է��ϼ��� . : "); 
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
	System.out.print("��� ���ڸ��Է����� �����ϼ��� !: ");	
	num = sc.nextInt();
	
	String [] arr1 = new String[num];
	input(arr1); 
    output(arr1);
    System.out.println("�ȳ�");
	
 //arr1[0] = sc.nextLine();

 
 
  


}


}
  

  
	

