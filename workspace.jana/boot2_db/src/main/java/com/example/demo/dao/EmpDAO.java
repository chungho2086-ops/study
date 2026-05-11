package com.example.demo.dao;

import java.util.List;
import java.util.Map;

import com.example.demo.dto.EmpDTO;

public interface EmpDAO {
	
	List<EmpDTO> selectAllEmp();
	EmpDTO selectOneEmp();
	Map selectOneEmpMap();
	
	EmpDTO selectEmpno(int empno);
	List selectEname(String ename);
	List selectJob(String job);
	List selectJobEname(EmpDTO dto);
	
	int insertEmp2(EmpDTO dto);
	int deleteEmp(int empno);
	int updateEmp(EmpDTO dto);
	EmpDTO selectEmpOne(int empno);
	
	List<EmpDTO> search(EmpDTO dto);
	List<EmpDTO> choice(EmpDTO dto);
}