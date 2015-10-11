package sample.spring.BankApplication.service;

import sample.spring.BankApplication.dao.FixedDepositDao;
import sample.spring.BankApplication.domain.FixedDepositDetails;

public interface FixedDepositService {
	FixedDepositDao getFixedDepositDao();

	FixedDepositDetails getFixedDepositDetails(long id);

	boolean createFixedDeposit(FixedDepositDetails fdd);

}
