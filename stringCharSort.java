------------------------
without using functions:
------------------------

import java.util.*;
class stringCharSort
  {
public static void main (String[] args)
     {		
	Scanner s=new Scanner(System.in);
	String st=s.next();
	
	int ar[]=new int[st.length()];
	
	for(int i=0;i<ar.length;i++)
           {ar[i]=st.charAt(i);}    //string to int array              		     
	  	int i=0;
	
	 for(int j=i+1;j<ar.length;j++)
 	    {   
     		if(ar[i]>ar[j])    //sort array(ascending)	
        	{ 
         	int t=ar[i];         
         	ar[i]=ar[j];
          	ar[j]=t;
                }
		
               if(i<ar.length && j==ar.length-1)      //re call loop & print element
               { 
               System.out.print((char)ar[i]);
               i++;
               j=i-1;
               }
           }
     }
}
 		
----------------
using functions: 
----------------
	
import java.util.*;
class stringCharSort
  {
	
      int[] stringtoIntArray(String st)
      {
          	int ar[]=new int[st.length()];
	    for(int i=0;i<ar.length;i++)
            ar[i]=st.charAt(i);
            return ar;
      }
	
      void sort(int ar[])
      {
	    for(int i=0;i<ar.length;i++){
	    for(int j=i+1;j<ar.length;j++)
 	       {   
     		if(ar[i]>ar[j])   	
        	   { 
         	    int t=ar[i];         
         	    ar[i]=ar[j];
          	    ar[j]=t;
               }
 	       }
        }
      }
	
      void print(int ar[])
      {
          for(int i=0;i<ar.length;i++)
          System.out.print((char)ar[i]);
      }
	
      public static void main (String[] args)
     {		
	Scanner s=new Scanner(System.in);
	stringCharSort ob=new stringCharSort();
	String st=s.next();
	int ar[]=ob.stringtoIntArray(st);
        ob.sort(ar);
        ob.print(ar);
     }
}
 		

