package com.epam.ExceptionsLogging.Interest;

public class Interest {
	
	double principle;
	double rate;
	double time;
	
	public Interest(double principle, double rate, double time) {
		super();
		this.principle = principle;
		this.rate = rate;
		this.time = time;
	}

	public double getPrinciple() {
		return principle;
	}

	public void setPrinciple(double principle) {
		this.principle = principle;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public double getTime() {
		return time;
	}

	public void setTime(double time) {
		this.time = time;
	}
	
	public double calculate()
	{
		return 0;
	}
	
	

}
