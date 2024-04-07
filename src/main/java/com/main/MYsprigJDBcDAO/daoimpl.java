package com.main.MYsprigJDBcDAO;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.mia.etity.passanger;



import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.mia.etity.passanger;

public class daoimpl implements Idao{
	
	private JdbcTemplate jdbcTemplate;
	
	   
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	@Override
	public int save(passanger pass) {
		
		 String query="insert into passanger(pname,PRN) value(?,?)";
	       
	        int r = jdbcTemplate.update(query,pass.getPname(),pass.getPRN());
	              
		    return r;
	}

	@Override
	public int update(passanger pass) {
		String query="update passanger set PRN=? where pname=?";
		int update=jdbcTemplate.update(query,pass.getPRN(),pass.getPname());
		return update;
	}

	@Override
	public List<passanger> select() {
		 String query= "select * from passanger"; 
		  List<passanger> student = jdbcTemplate.query(query, new MyRowMapper() {
			  
		  });
		  
		return student;
	}
	

	@Override
	public int delete(String pname) {
		String sql="delete from passanger where pname=?";
		int row=jdbcTemplate.update(sql, pname);
		return row;
    
	}

}
