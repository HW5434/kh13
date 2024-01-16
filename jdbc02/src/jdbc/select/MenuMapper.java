package jdbc.select;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MenuMapper implements RowMapper<MenuDto>{

	@Override
	public MenuDto mapRow(ResultSet rs, int idx) throws SQLException {
		MenuDto dto = new MenuDto();
		dto.setMenuNo(rs.getInt("menu_no"));
		dto.setMenuNameKr(rs.getString("menu_name_kor"));
		dto.setMenuNameEg(rs.getString("menu_name_eng"));
		dto.setMenuType(rs.getString("menu_type"));
		dto.setMunuPrice(rs.getInt("menu_price"));
		
		return dto;
	}
}