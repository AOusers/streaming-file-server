package com.daggerok.spring.streaming.fileserver.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;
import java.util.stream.Stream;

@RepositoryRestResource
public interface FileItemRepository extends JpaRepository<FileItem, Long> {

    Optional<FileItem> findById(@Param("id") long id);

    Stream<FileItem> findByFilenameLikeIgnoreCase(@Param("filename") String filename);
}
