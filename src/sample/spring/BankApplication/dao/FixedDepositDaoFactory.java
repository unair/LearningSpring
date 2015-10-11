package sample.spring.BankApplication.dao;

public class FixedDepositDaoFactory {
	public FixedDepositDaoFactory() {}
	
	private static FixedDepositDao fixedDepositDao = null;
	
	public  FixedDepositDao getFixedDepositDao(String type) {
		if (type.equalsIgnoreCase("hibernate")){
			if (fixedDepositDao != null) {
				return fixedDepositDao;
			} else {
				fixedDepositDao = new FixedDepositHibernateDao();
				return fixedDepositDao;
			}
		} else
			return null;
	}

}
