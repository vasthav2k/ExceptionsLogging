package com.epam.ExceptionsLogging.Interest;

public class CompoundInterest extends Interest
{

	public CompoundInterest(double principle, double rate, double time) {
		super(principle, rate, time);
	}

	@Override
	public double calculate() {
		
		return principle*Math.pow(1+rate/100, time);
		
	}
	
	

}
