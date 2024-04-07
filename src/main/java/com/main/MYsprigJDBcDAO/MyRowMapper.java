package com.main.MYsprigJDBcDAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.mia.etity.passanger;


	public class MyRowMapper  implements RowMapper<passanger>{

		@Override
		public passanger mapRow(ResultSet rs, int rowNum) throws SQLException {
			  
			passanger pass=new passanger();
			pass.setPname(rs.getString(1));
			pass.setPRN(rs.getInt(2));
			return pass;
		}

	}

