package com.mlc.frontEnd.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.mlc.frontEnd.Entities.ListOfResources;

public interface ListOfResourcesRepository extends JpaRepository<ListOfResources, Long> {

}
