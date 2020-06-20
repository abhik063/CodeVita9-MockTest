import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Abhishek Kumar
 */
public class CodeVita2 {
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
	
	String[] input = new String[2]; 
	int a, b;	
	input = sc.nextLine().split(" ");
	a= Integer.parseInt(input[0]);
	b= Integer.parseInt(input[1]);
        ArrayList<Integer> primeList=new ArrayList<Integer>();
        
        for(int i=a;i<=b;i++)
        {
            if(checkPrime(i))
                primeList.add(i);
        }

        combine(primeList);
        
    }
    static boolean checkPrime(int n)
    {
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
                count++;
        }
        if(count==2)
        {            
            return true;
        }
        return false;
    }
    static void combine(ArrayList a)
    {
      
        int size=a.size();
        ArrayList<Integer>genP=new ArrayList<Integer>();
        for( int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
            String n1=a.get(i).toString();
            if(j==size)break;
            String n2=a.get(j).toString();
            String num=n1+n2;
            int number=Integer.parseInt(num);
           
            if(checkPrime(number))
            {
                genP.add(number);
             
            }
            }
        }
        
        Collections.sort(genP);
  
         
          ArrayList<Integer> numberList = new ArrayList<Integer>();
            
            for (int i=0;i<genP.size();i++) 
            {
               if (!numberList.contains(genP.get(i))) {
                  numberList.add(genP.get(i));
                }
            }
            
         
        int small=Integer.parseInt(genP.get(0).toString());
        int largest=Integer.parseInt(genP.get(genP.size()-1).toString());
               
        long sec=largest;
        long t1 = small, t2 = sec;
        int num=numberList.size();
        
          for (int i = 1; i <= num-1; ++i)
        {
            

            long sums = t1 + t2;
            t1 = t2;
            t2 = sums;
        }
          System.out.println(t1);
    }
    
    
}
