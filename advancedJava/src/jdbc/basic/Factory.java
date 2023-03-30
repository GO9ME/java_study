package jdbc.basic;

import jdbc.dao.CustomerDAO;
import jdbc.dao.CustomerDAOImpl;

public class Factory {
	public CustomerDAO getDAO() {
		return new CustomerDAOImpl();
	}
}
