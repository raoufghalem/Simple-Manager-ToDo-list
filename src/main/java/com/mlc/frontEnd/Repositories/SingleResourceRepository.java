package com.mlc.frontEnd.Repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mlc.frontEnd.Entities.SingleResource;

public interface SingleResourceRepository extends JpaRepository<SingleResource, Long> {

	Optional<SingleResource> findByName(String name);

}
