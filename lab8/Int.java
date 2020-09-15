package lab8;

import java.util.Scanner;

public class Int {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner obj=new Scanner(System.in);
  System.out.println("enter the interger");
  String a=obj.next();
  char a1[]=a.toCharArray();
  System.out.println("display the interger");
  for(int i:a1)
  {
	  System.out.println((char)i);
  }
  int s=0;
  for(char j:a1)
  {
	  s=s+(j-48);
  }
  System.out.println("sum of interger"+s);
	}

}
