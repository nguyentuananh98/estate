package com.laptrinhjavaweb.repository.impl;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.laptrinhjavaweb.annotation.Table;
import com.laptrinhjavaweb.mapper.ResultSetMapper;
import com.laptrinhjavaweb.repository.EntityManagerFactory;
import com.laptrinhjavaweb.repository.JpaRepository;

public class SimpleJpaRepository<T> implements JpaRepository<T>{
	private Class<T> zClass;
	 @SuppressWarnings("unchecked")
	public SimpleJpaRepository() {
		Type type = getClass().getGenericSuperclass();
		ParameterizedType parameterizedType = (ParameterizedType) type;
		zClass = (Class<T>) parameterizedType.getActualTypeArguments()[0];
	}
	@Override
	public List<T> findAll() {
		//List<T> results = new ArrayList<>();
		ResultSetMapper<T> resultSetMapper = new ResultSetMapper<>();
		Connection conn = EntityManagerFactory.getConnection();
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		String tableName = "";
		try {
			if(zClass.isAnnotationPresent(Table.class)) {
				Table table = zClass.getAnnotation(Table.class);
				tableName = table.name();
			}
			String sql = "select*from "+tableName+";";
			statement = conn.prepareStatement(sql);
			resultSet = statement.executeQuery();
			return resultSetMapper.mapRow(resultSet, this.zClass);
		}catch(SQLException e) {
			return null;
		}finally {
			try {
			if(conn!=null) {
				conn.close();
			}
			if(statement!= null) {
				statement.close();
			}
			if(resultSet != null) {
				resultSet.close();
			}
			}catch(SQLException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
