package com.mlc.frontEnd.Services;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.hibernate.dialect.identity.SybaseAnywhereIdentityColumnSupport;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

import com.mlc.frontEnd.Entities.SingleResource;
import com.mlc.frontEnd.Repositories.SingleResourceRepository;

@Service
public class SingleResourceService {
	
	SingleResourceRepository singleResourceRepository;
	public SingleResourceService(SingleResourceRepository singleResourceRepository) {
		this.singleResourceRepository = singleResourceRepository;
	}


	public Optional<SingleResource> findById(Long id) {
		Optional<SingleResource> tmp = singleResourceRepository.findById(id);
		if(tmp.isPresent()) {
			return tmp;
		} else {
			
			return tmp.empty();
		}	
		
		
	
	}
	public Optional<SingleResource> findByName(String search) {
		return singleResourceRepository.findByName(search);
	}
	public Collection<SingleResource> findAll(){
		return  singleResourceRepository.findAll();
	}


	public void addResource(SingleResource singleresource) {
		singleResourceRepository.save(singleresource);
		
	}


	public void removeResource(SingleResource singleresource) {
		singleResourceRepository.delete(singleresource);
		
	}

}
