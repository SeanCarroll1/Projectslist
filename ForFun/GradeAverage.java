package ForFun;

import java.util.ArrayList;
import java.util.Scanner;

public class GradeAverage 
{
	public static void main(String [] args)
	{
		System.out.println("Enter up to 20 grades and then the average will be printed.");
		System.out.println("Enter -1 to stop entering grades.");
		
		System.out.println("The Average is : " +Average(grades()));
	}
	
	
	public static ArrayList<Integer> grades()
	{
		ArrayList<Integer> list= new ArrayList<>();
		Scanner in=new Scanner(System.in);
		
		for(int i=0; i<20; i++)
		{
			int temp=in.nextInt();
			
			if(temp==-1)
			{
				break;
			}
			
			list.add(temp);
		}
		
		in.close();
		
		return list;
	}
	
	public static double Average(ArrayList<Integer> list)
	{
		double average=0;
		
		for (Integer temp : list)
		{
			average+=temp;
		}
		
		return average/list.size();
	}
}
