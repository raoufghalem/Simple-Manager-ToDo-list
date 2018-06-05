package com.mlc.frontEnd.Repositories;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mlc.frontEnd.Entities.Comment;
import com.mlc.frontEnd.Entities.Labels;

public interface LabelsRepository extends JpaRepository<Labels, Long> {

	Collection<Labels> findAllByLabelName(String name);

}
