package com.technoidentity.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import com.technoidentity.dao.PdSanctionDao;
import com.technoidentity.dto.PdSanctionDto;
import com.technoidentity.model.PdSanction;

@Service
public class PdSanctionReportServiceImpl implements PdSanctionReportService {
	@Autowired
	private PdSanctionDao pdSanctionDao;
	List<PdSanctionDto> pdSanctionDtoList;

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public JRDataSource getPdSanctionId(String id) {
		pdSanctionDtoList = new ArrayList<PdSanctionDto>();
		PdSanctionDto pdSanctionDto = new PdSanctionDto();
		try {
			PdSanction pdSanction = pdSanctionDao.getId(new Integer(id));
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

			pdSanctionDtoList.add(pdSanctionDto);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return new JRBeanCollectionDataSource(pdSanctionDtoList);

	}

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public JRDataSource getDataSource() {
		try {
			pdSanctionDtoList = new ArrayList<PdSanctionDto>();
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
		} catch (Exception e) {
			e.printStackTrace();
		}

		return new JRBeanCollectionDataSource(pdSanctionDtoList);

	}

}
