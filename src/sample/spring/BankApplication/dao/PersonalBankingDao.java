package sample.spring.BankApplication.dao;

import sample.spring.BankApplication.domain.FixedDepositDetails;

public interface PersonalBankingDao {

	FixedDepositDetails getFixedDepositDetails(long id);

	boolean createFixedDeposit(FixedDepositDetails fdd);
}

