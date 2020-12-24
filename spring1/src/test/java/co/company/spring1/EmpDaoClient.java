package co.company.spring1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import co.company.spring1.config.DBConfiguration;
import co.company.spring1.dao.EmpDAO;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { DBConfiguration.class})
public class EmpDaoClient {
	
	@Autowired EmpDAO empDAO;
	@Test
	public void empdaotest() {
		System.out.println(empDAO.getList());
	}
	
}
