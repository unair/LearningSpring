package sample.spring.BankApplication.controller;

import sample.spring.BankApplication.domain.FixedDepositDetails;
import sample.spring.BankApplication.service.FixedDepositService;

public interface FixedDepositController {
	FixedDepositService getFixedDepositService();

	boolean submit();

	FixedDepositDetails get();
}
