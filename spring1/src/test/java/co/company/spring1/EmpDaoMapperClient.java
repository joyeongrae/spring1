package co.company.spring1;

import java.sql.Date;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import co.company.spring1.config.DBConfiguration;
import co.company.spring1.config.MybatisConfiguration;
import co.company.spring1.dao.Emp;
import co.company.spring1.dao.EmpMapper;
import co.company.spring1.dao.EmpSearch;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { DBConfiguration.class, MybatisConfiguration.class })

public class EmpDaoMapperClient {
   @Autowired
   EmpMapper empDAO;

 
   
 @Test
 public void getStatDept() {
	 
	 List<Map<String, Object>> list = 
		 empDAO.getStatDept();
	 System.out.println(list.get(0));
	 System.out.println(list.get(0).get("deptName"));
	 
	 
	 
 }
   
// @Test
// public void getCount() {
//	   Emp emp = new Emp();
//	
//	   int count = empDAO.getCount();
//	   
//	   System.out.println(count);
// }
   
   
//   @Test
//   public void InsertProcTest() {
//	   Emp emp = new Emp();
//	   
//	   emp.setLastName("choi");
//	   emp.setJobId("IT_PROG");
//	   emp.setEmail("a@a.dfd");
//	   
//	   empDAO.insertEmpProc(emp);
//	   
//	   System.out.println(emp.getEmployeeId()+":" + emp.getMsg());
//   }
   
//   @Test
//   public void updateTest() {
//	   Emp emp = new Emp();
//	   emp.setEmployeeId("102");
//	   System.out.println(empDAO.getEmp(emp));
//	   
//	   emp.setFirstName("hong");
//	   empDAO.updateEmp(emp);
//	   
//	   System.out.println(empDAO.getEmp(emp));
//   }
//   @Test
//   public void mybatisTest() {
//	  EmpSearch empvo = new EmpSearch();
////	  empvo.setFirstName("m");
////     empvo.setDepartmentId("20");
//	   empvo.setMinSalary(0);
//	   empvo.setMaxSalary(100000);
//	  List<Emp> list = empDAO.getEmpList(empvo);
//      for(Emp emp:list) {
//    	  System.out.println(emp.getEmployeeId()+":" + emp.getFirstName()+":"
//    			  			 +emp.getDepartmentId()+":"
//    			  			 +emp.getJobId() +":"
//    			  			 +emp.getSalary());
//      }
//   }
    
//   @Test
//   public void InsertTest() {
//	   Emp emp = new Emp();
//	   emp.setFirstName("길동");
//	   emp.setLastName("choi");
//	   emp.setJobId("IT_PROG");
//	   emp.setEmail("a@a.df");
//	   emp.setHireDate(new Date(System.currentTimeMillis()));
//	   empDAO.insertEmp(emp);
//	   System.out.println(emp.getEmployeeId());
//   }
   
//   @Test
//   public void deleteMultiTest() {
//	   EmpSearch emp = new EmpSearch();
//	   emp.setList(new String[] {"1000","1001"});
//	   empDAO.deleteMultEmp(emp);
//   }
}