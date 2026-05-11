package com.example.demo.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EmpDAO;

import com.example.demo.dto.EmpDTO;

@Service
public class EmpServiceImpl implements EmpService {

	@Autowired
	EmpDAO empDAO;
	
	

	@Override
	public List<EmpDTO> getEmpList() {
		return empDAO.selectAllEmp();
	}

	@Override
	public EmpDTO getEmp() {
		return empDAO.selectOneEmp();
	}

	@Override
	public Map getEmpMap() {
		return empDAO.selectOneEmpMap();
	}

	@Override
	public EmpDTO selectEmpno(int empno) {
		return empDAO.selectEmpno(empno);
	}

	@Override
	public List selectEname(String ename) {
		return empDAO.selectEname(ename);
	}

	@Override
	public List selectJob(String job) {
		return empDAO.selectJob(job);
	}

	@Override
	public List selectJobEname(EmpDTO dto) {
		return empDAO.selectJobEname(dto);
	}

	@Override
	public int insertEmp2(EmpDTO dto) {
		return empDAO.insertEmp2(dto);
	}

	@Override
	public int updateEmp(EmpDTO dto) {
		return empDAO.updateEmp(dto);
	}

	@Override
	public int deleteEmp(int empno) {
		return empDAO.deleteEmp(empno);
	}

	@Override
	public EmpDTO selectEmpOne(int empno) {
		return empDAO.selectEmpOne(empno);
	}

	@Override
	public List<EmpDTO> search(EmpDTO dto) {
		return empDAO.search(dto);
	}

	@Override
	public List<EmpDTO> choice(EmpDTO dto) {
		return empDAO.choice(dto);
	}


	
	
}