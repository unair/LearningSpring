package sample.spring.BankApplication.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


import sample.spring.BankApplication.service.FixedDepositService;
import sample.spring.BankApplication.domain.FixedDepositDetails;

public class FixedDepositControllerImpl implements FixedDepositController {
	private static Log logger = LogFactory.getLog(FixedDepositControllerImpl.class);
	
	private FixedDepositService fixedDepositService;
	private String passTheValue = null;

	private String firstString;
	private String secondString;
	
	//Constructor
	public FixedDepositControllerImpl(String firstString, String secondString) {
		this.firstString=firstString;
		this.secondString=secondString;
		logger.info("Set the first string: " + firstString);
		logger.info("Set the second string: " + secondString);
	}
	public String getPassTheValue() {
		return passTheValue;
	}

	public void setPassTheValue(String passTheValue) {
		this.passTheValue = passTheValue;
		logger.info("The passTheValue String has been set to :" + passTheValue);
	}

	public FixedDepositControllerImpl() {
		logger.info("initializing");
	}
	
	public FixedDepositService getFixedDepositService() {
		return fixedDepositService;
	}
	
	public void setFixedDepositService(FixedDepositService fixedDepositService) {
		logger.info("Setting fixedDepositService property");
		this.fixedDepositService = fixedDepositService;
	}
	
	public boolean submit() {
		return fixedDepositService.createFixedDeposit(new FixedDepositDetails(
				1, 10000, 365, "someemail@something.com"));
	}
	
	public FixedDepositDetails get() {
		return fixedDepositService.getFixedDepositDetails(1L);
	}
}
