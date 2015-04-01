package com.technoidentity.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.technoidentity.dao.PdSanctionDao;
import com.technoidentity.dto.PdSanctionDto;
import com.technoidentity.model.PdSanction;

@Service
public class PdSanctionServiceImpl implements PdSanctionService {
	@Autowired
	private PdSanctionDao pdSanctionDao;

	@Transactional
	public void addPdSanction(PdSanctionDto pdSanctionDto) {
		PdSanction pdSanction = new PdSanction();
		pdSanction.setPropcode(pdSanctionDto.getPropcode());
		pdSanction.setNatureofjob(pdSanctionDto.getNatureofjob());
		pdSanction.setAmount(pdSanctionDto.getAmount());
		pdSanction.setDemandingofficer(pdSanctionDto.getDemandingofficer());
		pdSanction.setSanctioncode(pdSanctionDto.getSanctioncode());
		pdSanction.setDate(pdSanctionDto.getDate());
		pdSanction.setPddecision(pdSanctionDto.getPddecision());
		pdSanction.setRemarks(pdSanctionDto.getRemarks());
		pdSanction.setDescription(pdSanctionDto.getDescription());

		pdSanctionDao.addPdSanction(pdSanction);
	}

	@Transactional
	public void editPdSanction(PdSanctionDto pdSanctionDto) {
		PdSanction pdSanction =pdSanctionDao.getId(new Integer(pdSanctionDto.getId()));
		pdSanction.setPropcode(pdSanctionDto.getPropcode());
		pdSanction.setNatureofjob(pdSanctionDto.getNatureofjob());
		pdSanction.setAmount(pdSanctionDto.getAmount());
		pdSanction.setDemandingofficer(pdSanctionDto.getDemandingofficer());
		pdSanction.setSanctioncode(pdSanctionDto.getSanctioncode());
		pdSanction.setDate(pdSanctionDto.getDate());
		pdSanction.setPddecision(pdSanctionDto.getPddecision());
		pdSanction.setRemarks(pdSanctionDto.getRemarks());
		pdSanction.setDescription(pdSanctionDto.getDescription());
		pdSanctionDao.editPdSanction(pdSanction);
	}

	@Transactional
	public List<PdSanctionDto> listPdSanction(){
		List<PdSanctionDto> pdSanctionDtoList = new ArrayList<PdSanctionDto>();
		try{
		List<PdSanction> pdSanctionList = pdSanctionDao.listPdSanction();
		for (PdSanction pdSanction : pdSanctionList) {
			PdSanctionDto pdSanctionDto = new PdSanctionDto();
			pdSanctionDto.setId(pdSanction.getId().toString());
			pdSanctionDto.setPropcode(pdSanction.getPropcode());
			pdSanctionDto.setNatureofjob(pdSanction.getNatureofjob());
			pdSanctionDto.setAmount(pdSanction.getAmount());
			pdSanctionDto.setDemandingofficer(pdSanction
					.getDemandingofficer());
			pdSanctionDto.setSanctioncode(pdSanction.getSanctioncode());

			pdSanctionDto.setDate(pdSanction.getDate());
			pdSanctionDto.setPddecision(pdSanction.getPddecision());
			pdSanctionDto.setRemarks(pdSanction.getRemarks());

			pdSanctionDto.setDescription(pdSanction.getDescription());

			pdSanctionDtoList.add(pdSanctionDto);
		}
		}catch(Exception e){
			e.printStackTrace();
		}

		return pdSanctionDtoList;
	}

	@Transactional
	public PdSanctionDto getId(String id) {
PdSanction pdSanction=pdSanctionDao.getId(new Integer(id));
			PdSanctionDto pdSanctionDto=new PdSanctionDto();
			pdSanctionDto.setId(pdSanction.getId().toString());
			pdSanctionDto.setPropcode(pdSanction.getPropcode());
			pdSanctionDto.setNatureofjob(pdSanction.getNatureofjob());
			pdSanctionDto.setAmount(pdSanction.getAmount());
			pdSanctionDto.setDemandingofficer(pdSanction.getDemandingofficer());
			pdSanctionDto.setSanctioncode(pdSanction.getSanctioncode());
			pdSanctionDto.setDate(pdSanction.getDate());
			pdSanctionDto.setPddecision(pdSanction.getPddecision());
			pdSanctionDto.setRemarks(pdSanction.getRemarks());
			pdSanctionDto.setDescription(pdSanction.getDescription());

						return pdSanctionDto;
		}

	}


