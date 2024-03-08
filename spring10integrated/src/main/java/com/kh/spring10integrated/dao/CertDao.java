package com.kh.spring10integrated.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh.spring10integrated.dto.CertDto;
import com.kh.spring10integrated.mapper.CertMapper;

@Repository
public class CertDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	private CertMapper certMapper;

	public void insert(CertDto certDto) {
		String sql = "insert into cert(cert_email, cert_number) values(?, ?)";
		Object[] data = {certDto.getCertEmail(), certDto.getCertNumber()};
		jdbcTemplate.update(sql, data);
	}
	
	public boolean delete(String certEmail) {
		String sql = "delete cert where cert_email = ?";
		Object[] data = {certEmail};
		return jdbcTemplate.update(sql, data) > 0;
	}
	
	public CertDto selectOne(String certEmail) {
		String sql = "select * from cert where cert_email = ?";
		Object[] data = {certEmail};
		List<CertDto> list = jdbcTemplate.query(sql, certMapper, data);
		return list.isEmpty() ? null : list.get(0);
	}
}
