package com.mlc.frontEnd.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mlc.frontEnd.Entities.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {

}
