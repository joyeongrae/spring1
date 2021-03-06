package co.company.spring1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import co.company.spring1.config.DBConfiguration;
import co.company.spring1.dao.Emp;
import co.company.spring1.dao.EmpDAOJdbcTemplate;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { DBConfiguration.class})
public class EmpDaoJdbcTemplateClient {
	
	@Autowired 
	EmpDAOJdbcTemplate empDAO;
	 
	@Test
	public void empdaotest() {
		System.out.println(empDAO.getListMap());
	}	
	
	@Test
	public void insert() {
		Emp emp = new Emp();
		emp.setEmployeeId("1000");
		emp.setLastName("aaaa");
		emp.setEmail("a@a.a");
		empDAO.insert(emp);
	}
}
