package com.epam.ExceptionsLogging.Interest;

public class SimpleInterest extends Interest
{

	public SimpleInterest(double principle, double rate, double time) {
		super(principle, rate, time);
	}

	
	public double calculate() {
		return this.principle+ this.principle*this.time*this.rate/100;
	}
	
}
