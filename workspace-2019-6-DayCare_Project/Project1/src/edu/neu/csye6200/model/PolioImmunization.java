package edu.neu.csye6200.model;

import java.util.Date;

public class PolioImmunization extends Immunization{

	private String polioVaccine = "Polio Immunization"; 
	public PolioImmunization(int ageReceived, Date dateReceived) {
		this.setImmunizationName(polioVaccine);
		this.setAgeReceived(ageReceived);
		this.setDateReceived(dateReceived);
		this.setRule(new Rule());
		// TODO Auto-generated constructor stub
	}

	@Override
	public void CheckImmunization() {
		// TODO Auto-generated method stub
		
	}

}