package com.epam.ExceptionsLogging.ConstructionCost;
public class Construction
{
	int choice;
	double totalArea;
	boolean fullyAutomated=false;
	
	public Construction(int choice, double totalArea, boolean fullyAutomated){
		super();
		this.choice = choice;
		this.totalArea = totalArea;
		this.fullyAutomated = fullyAutomated;
	}

	public int getChoice() {
		return choice;
	}

	public void setChoice(int choice) {
		this.choice = choice;
	}

	public double getTotalArea() {
		return totalArea;
	}

	public void setTotalArea(double totalArea) {
		this.totalArea = totalArea;
	}

	public boolean isFullyAutomated() {
		return fullyAutomated;
	}

	public void setFullyAutomated(boolean fullyAutomated) {
		this.fullyAutomated = fullyAutomated;
	}

	public double calculateCost()
	{
		int costpersqft=0;
		int[] ratespersqft= {1200,1500,1800,2500};
		if(this.isFullyAutomated()==true)
			costpersqft=ratespersqft[3];
		else
			costpersqft=ratespersqft[choice-1];
		
		return this.getTotalArea()*costpersqft;
	}
	
	
}
