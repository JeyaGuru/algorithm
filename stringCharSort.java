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
 		
		
