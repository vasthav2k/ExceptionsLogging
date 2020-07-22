package com.epam.ExceptionsLogging.ConstructionCost;
import java.io.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class CostCalculator
{
	private static final Logger LOGGER=LogManager.getLogger(CostCalculator.class);
	public static void main(String[] args)
	{
		
		BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter=new BufferedWriter(new OutputStreamWriter(System.out));
		
		try
		{
			bufferedWriter.write("Enter Area:");
			bufferedWriter.flush();
			double area=Double.parseDouble(bufferedReader.readLine());
			
			bufferedWriter.write("Choose the quality of the material\n1.Standard-1200 INR\n2.Above Standard-1500 INR\n3.High Standard 1800 INR\nEnter Your Choice:");
			bufferedWriter.flush();
			int choice=Integer.parseInt(bufferedReader.readLine());
			
			boolean fullyAutomated=false;
			if (choice == 3)
			{
				bufferedWriter.write("Press 1 if you want fully automated house(2500 INR):");
				bufferedWriter.flush();
				fullyAutomated=Integer.parseInt(bufferedReader.readLine())==1;
			}
			
			Construction construction=new Construction(choice,area,fullyAutomated);
			
			LOGGER.info("Construction Cost: "+construction.calculateCost() +" INR\n");
			bufferedWriter.flush();
			
		}
		catch (NumberFormatException e) {
			e.printStackTrace();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
