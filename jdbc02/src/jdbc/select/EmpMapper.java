package jdbc.select;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmpMapper implements RowMapper<EmpDto> {

	@Override
	public EmpDto mapRow(ResultSet rs, int idx) throws SQLException {
		EmpDto dto = new EmpDto();
		dto.setEmpNo(rs.getInt("emp_no"));
		dto.setEmpName(rs.getNString("emp_name"));
		dto.setEmpDept(rs.getNString("emp_dept"));
		dto.setEmpDate(rs.getNString("emp_date"));
		dto.setEmpSal(rs.getInt("emp_sal"));
		return dto;
		
	}
}
