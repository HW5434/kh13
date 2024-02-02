package com.kh.spring10integrated.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh.spring10integrated.dto.ItemDto;
import com.kh.spring10integrated.mapper.ItemMapper;

@Repository
public class ItemDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	private ItemMapper itemMapper;
	
	public int getSequence() {
		String sql = "select item_seq.nextval from dual";
		return jdbcTemplate.queryForObject(sql, int.class);
	}
	
	public void insert(ItemDto itemDto) {
		String sql = "insert into item("
				+ "item_no, item_name, item_price, item_charge"
				+ ") values(?, ?, ?, ?)";
		Object[] data = {
				itemDto.getItemNo(), itemDto.getItemName(),
				itemDto.getItemPrice(), itemDto.getItemCharge(),
		};
		jdbcTemplate.update(sql, data);
	}
	
}
