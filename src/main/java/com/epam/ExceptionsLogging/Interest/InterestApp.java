package com.epam.ExceptionsLogging.Interest;

import java.io.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class InterestApp {
	
	private static final Logger LOGGER =LogManager.getLogger(InterestApp.class);
	
	public static void main(String[] args)
	{
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			bufferedWriter.write("Enter Principle:");
			bufferedWriter.flush();
			double principle=Double.parseDouble(bufferedReader.readLine());
			
			bufferedWriter.write("Enter rate of Interest:");
			bufferedWriter.flush();
			double rate=Double.parseDouble(bufferedReader.readLine());
			
			bufferedWriter.write("Enter No.of years:");
			bufferedWriter.flush();
			double time=Double.parseDouble(bufferedReader.readLine());
			
			Interest simpleInterest=new SimpleInterest(principle,rate,time);
			bufferedWriter.write("Simple Interest:" + simpleInterest.calculate()+"\n");
			bufferedWriter.flush();
			
			Interest compoundInterest=new CompoundInterest(principle,rate,time);
			LOGGER.info("Compound Intertest:"+compoundInterest.calculate()+"");
//			bufferedWriter.flush();
		} 
		catch (NumberFormatException e) {
			e.printStackTrace();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		

		
		
	}

}
