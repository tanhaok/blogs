package com.thebasics.blogsapi.repository;

import com.thebasics.blogsapi.entity.BlogContent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBlogContentRepository extends JpaRepository<BlogContent, Long> {

}
