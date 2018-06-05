package com.mlc.frontEnd.Services;

import java.util.Collection;

import org.springframework.stereotype.Service;

import com.mlc.frontEnd.Entities.Labels;
import com.mlc.frontEnd.Repositories.LabelsRepository;

@Service
public class LabelsService {
	
	LabelsRepository labelsRepository;
	public LabelsService(LabelsRepository labelsRepository) {
		this.labelsRepository = labelsRepository;
	}

	public Collection<Labels> findall() {
		return labelsRepository.findAll();
		
	}

	public Collection<Labels> findByName(String name) {
		// TODO Auto-generated method stub
		return labelsRepository.findAllByLabelName(name);
	}
	
	public Labels addLabel(Labels label) {
		return labelsRepository.save(label);
	}

	public void deleteLabel(Labels removeLabel) {
		 labelsRepository.delete(removeLabel);
	}
	
	

}
