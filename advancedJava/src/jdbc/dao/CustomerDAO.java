package jdbc.dao;

import java.util.ArrayList;

public interface CustomerDAO {
	int insert(CustomerVO customer);
	
	ArrayList<CustomerVO> getMemberList();

	int update(String id, int point, String pass);

	int delete(String id);

	ArrayList<CustomerVO> select(String addr);

	CustomerVO login(String id, String pass);
	
	CustomerVO getCustomerInfo(String id);
	
	
}
