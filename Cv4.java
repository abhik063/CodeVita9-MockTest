/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codevita;

import java.util.Scanner;

/**
 *
 * @author Abhishek Kumar
 */
public class Cv4 {
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int count=0;
        int C=Integer.parseInt(scan.nextLine());
        int x[]=new int[C];
        int y[]=new int[C];
        int v[]=new int[C];
        double time[]=new double[C];
        for(int i=0;i<C;i++)
        {	
         String[] input = new String[3]; 
            input = scan.nextLine().split(" ");
            x[i]= Integer.parseInt(input[0]);
            y[i]= Integer.parseInt(input[1]);
              v[i]= Integer.parseInt(input[2]);
             time[i]= collision(x[i],y[i],v[i]);
        }
        for(int i=0;i<C;i++)
        {
            if(i==C-1)break;
            for(int j=i+1;j<C;j++)
            {
                if(time[i]==time[j])
                {
                    count++;
                }
            }
            
        }
        System.out.println(count);
    }
    static double collision(int x,int y, int v)
    {
        
        //double m=(y-c)/x;
        double distance=calculateDistanceBetweenPoints(x,y,0,0);
        double time=distance/v;
        return time;
        
    }
    static double calculateDistanceBetweenPoints(
  double x1, 
  double y1, 
  double x2, 
  double y2) {       
    return Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
}
}
