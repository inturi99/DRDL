package com.technoidentity.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.technoidentity.dao.SoClearenceDao;
import com.technoidentity.dto.SoClearenceDto;
import com.technoidentity.model.SoClearence;

@Service
public class SoClearenceServiceImpl implements SoClearenceService {
	@Autowired
	private SoClearenceDao soClearenceDao;

	@Override
	@Transactional
	public void addSoClearence(SoClearenceDto soClearenceDto) {
		SoClearence soClearence = new SoClearence();
		soClearence.setPropcode(soClearenceDto.getPropcode());
		soClearence.setAmount(soClearenceDto.getAmount());
		soClearence.setDate(soClearenceDto.getDate());
		soClearence.setDemandingofficer(soClearenceDto.getDemandingofficer());
		soClearence.setNatureofjob(soClearenceDto.getNatureofjob());
		soClearence.setSodecision(soClearenceDto.getSodecision());
		soClearenceDao.addSoClearence(soClearence);
	}

	@Override
	@Transactional
	public void editSoClearence(SoClearenceDto soClearenceDto) {
		SoClearence soClearence = soClearenceDao.getId(new Integer(soClearenceDto.getId()));
		soClearence.setPropcode(soClearenceDto.getPropcode());
		soClearence.setDemandingofficer(soClearenceDto.getDemandingofficer());
		soClearence.setNatureofjob(soClearenceDto.getNatureofjob());
		soClearence.setAmount(soClearenceDto.getAmount());
		soClearence.setDate(soClearenceDto.getDate());
		soClearence.setSodecision(soClearenceDto.getSodecision());
		soClearenceDao.editSoClearence(soClearence);
	}

	@Override
	@Transactional
	public List<SoClearenceDto> listSoClearence() {
		List<SoClearenceDto> soClearenceDtoList = new ArrayList<SoClearenceDto>();
		try{
		List<SoClearence> soClearenceList = soClearenceDao.listSoClearence();
		for (SoClearence soClearence : soClearenceList) {
			SoClearenceDto soClearenceDto = new SoClearenceDto();
            soClearenceDto.setId(soClearence.getId().toString());
			soClearenceDto.setPropcode(soClearence.getPropcode());
			soClearenceDto.setNatureofjob(soClearence.getNatureofjob());
			soClearenceDto.setAmount(soClearence.getAmount());
			soClearenceDto.setDemandingofficer(soClearence
					.getDemandingofficer());
			soClearenceDto.setDate(soClearence.getDate());
			soClearenceDto.setSodecision(soClearence.getSodecision());
			soClearenceDtoList.add(soClearenceDto);
		}
		}catch(Exception e){
			e.printStackTrace();
		}

		return soClearenceDtoList;
	}

	@Override
	@Transactional
	public SoClearenceDto getId(String id) {
			SoClearence soClearence=soClearenceDao.getId(new Integer(id));
			SoClearenceDto soClearenceDto=new SoClearenceDto();
			soClearenceDto.setId(soClearence.getId().toString());
			soClearenceDto.setPropcode(soClearence.getPropcode());
			soClearenceDto.setNatureofjob(soClearence.getNatureofjob());
			soClearenceDto.setAmount(soClearence.getAmount());
			soClearenceDto.setDate(soClearence.getDate());
			soClearenceDto.setDemandingofficer(soClearence.getDemandingofficer());
			soClearenceDto.setSodecision(soClearence.getSodecision());
						return soClearenceDto;
		}

	@Override
	@Transactional(readOnly = false)
	public List<SoClearenceDto> listSoClearenceOfficer() {
		List<SoClearenceDto> soClearenceDtoList = new ArrayList<SoClearenceDto>();
		try{
		List<SoClearence> soClearenceList = soClearenceDao.listSoClearenceOfficer();
		for (SoClearence soClearence : soClearenceList) {
			SoClearenceDto soClearenceDto = new SoClearenceDto();
            soClearenceDto.setId(soClearence.getId().toString());
			soClearenceDto.setPropcode(soClearence.getPropcode());
			soClearenceDto.setNatureofjob(soClearence.getNatureofjob());
			soClearenceDto.setAmount(soClearence.getAmount());
			soClearenceDto.setDemandingofficer(soClearence
					.getDemandingofficer());
			soClearenceDto.setDate(soClearence.getDate());
			soClearenceDto.setSodecision(soClearence.getSodecision());
			soClearenceDtoList.add(soClearenceDto);
		}
		}catch(Exception e){
			e.printStackTrace();
		}

		return soClearenceDtoList;
	}
	}


