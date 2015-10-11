package sample.spring.BankApplication.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import sample.spring.BankApplication.dao.FixedDepositDao;
import sample.spring.BankApplication.domain.FixedDepositDetails;

public class FixedDepositServiceImpl implements FixedDepositService {
	private static Log logger = LogFactory.getLog(FixedDepositServiceImpl.class);

	private FixedDepositDao fixedDepositDao;

	public FixedDepositServiceImpl() {
		logger.info("initializing");
	}

	public FixedDepositDao getFixedDepositDao() {
		return fixedDepositDao;
	}

	public void setFixedDepositDao(FixedDepositDao fixedDepositDao) {
		logger.info("Setting fixedDepositDao property");
		this.fixedDepositDao = fixedDepositDao;
	}

	public FixedDepositDetails getFixedDepositDetails(long id) {
		return fixedDepositDao.getFixedDepositDetails(id);
	}

	public boolean createFixedDeposit(FixedDepositDetails fdd) {
		return fixedDepositDao.createFixedDeposit(fdd);
	}
}
