package com.thebasics.blogsapi.repository;

import com.thebasics.blogsapi.entity.BlogPost;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBlogPostRepository extends JpaRepository<BlogPost, Long> {

    Optional<BlogPost> findBySlug(String slug);

    boolean existsBySlug(String slug);
}
