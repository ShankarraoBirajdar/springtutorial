package com.spring.jdbc.resultsetextractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

public class GroupByAddressResultSetExtractor implements ResultSetExtractor<Map<String, List<String>>> {

	@Override
	public Map<String, List<String>> extractData(ResultSet rs) throws SQLException, DataAccessException {

		Map<String, List<String>> map = new HashMap<String, List<String>>();
		
		
		while (rs.next()) {
			String name = rs.getString("STUDENT_NAME");
			String address = rs.getString("ADDRESS");
			List<String> studentNameList = map.get(address);
			
			if (studentNameList==null) {
				List<String> names = new ArrayList<String>() ;
				names.add(name);
				map.put(address, names);
			}else {
				studentNameList.add(name);
			}
		}
		return map;
	}

}
