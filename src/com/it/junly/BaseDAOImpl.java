package com.it.junly;

import java.sql.Connection;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.stereotype.Repository;
@Repository("sqlBaseDAO")
public class BaseDAOImpl implements BaseDAO {

	@Resource
	private JdbcTemplate jdbcTemplate;
	

	public void insert(Object obj) {

	}

	public void insert(String sql) {
		jdbcTemplate.execute(sql);
	}

	public void insertObjects(String[] sqls) {
		jdbcTemplate.batchUpdate(sqls);
	}

	public List<Map<String, Object>> select(String sql) {
		return jdbcTemplate.queryForList(sql);
	}

	public void update(String how) {
		jdbcTemplate.update(how);

	}

	public void delete(String sql) {
		if (sql == null) {
			return;
		}
		jdbcTemplate.execute(sql);
	}

	public void edit(String sql) {
		if (sql == null) {
			return;
		}
		jdbcTemplate.execute(sql);
	}

	public void execute(String sql, PreparedStatementCallback callback) {
		jdbcTemplate.execute(sql, callback);
	}
	
	public void save(String sql) {
		if (sql == null) {
			return;
		}
		jdbcTemplate.execute(sql);
	}

	public Connection getConnection() throws Exception {
		Connection conn = jdbcTemplate.getDataSource().getConnection();
		return conn;
	}

}