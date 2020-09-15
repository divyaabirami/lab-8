package lab8;

import java.util.Scanner;

public class duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner obj=new Scanner(System.in);
   System.out.println("enter the string");
   String a1="";
   String a2=obj.next();
   System.out.println("entered string is"+a2);
   char a[]=a2.toCharArray();
   boolean flag;
   int i;
   for(i=0;i<a2.length();i++)
   {
	   flag=false;
	   for(int j=i+1;j<a2.length();j++)
	   {
		   if(a[i]==a[j])
		   {
			   flag=true;
			   break;
		   }
	   }
	   if(!flag)
	   {
		   a1+=a[i];
	   }
   }
   System.out.println(a1);
	}

}
