package co.company.spring1.dao;

import java.util.List;
import java.util.Map;

public interface EmpMapper {

	//public List<Emp> getEmpList(Emp emp);
	public List<Emp> getEmpList(Emp emp);
	public int updateEmp(Emp emp);
	public Emp getEmp(Emp emp);
	public int insertEmp(Emp emp);
	public int deleteEmp(Emp emp);
	public int deleteMultEmp(EmpSearch emp);
	
	public void insertEmpProc(Emp emp);
	public int getCount();
	
	public List<Map<String,Object>> getStatDept();
	public List<Jobs> jobSelect();
	
	public List<Deps> depSelect();
	
}
 