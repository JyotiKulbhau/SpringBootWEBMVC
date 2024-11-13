package com.mvc.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.mvc.model.Employee;

@Component
public class EmpDao {

	JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {
		this.template=template;
	}
	
	public int save(Employee emp) {
		String query="insert into employee11(name,salary,designation) values('"+emp.getName()+"','"+emp.getSalary()+"','"+emp.getDesignation()+"')";
	    return template.update(query);
	}
	
	public int update(Employee emp) {
		String sql="update employee11 set name='"+emp.getName()+"', salary='"+emp.getSalary()+"', designation='"+emp.getDesignation()+"' where id='"+emp.getId()+"'";
	    return template.update(sql);
	}
	
	public int delete(int id) {
		String query="delete from employee11 where id='"+id+"'";
		return template.update(query);
	}
	
	public Employee getEmployeeById(int id) {
		String query="select * from employee11 where id=?";
		return (Employee) template.queryForObject(query, new Object[] {id}, new EmployeeRowMapper());
	}
	
	
}
