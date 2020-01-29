package com.example.mydemo.repository;

import com.example.mydemo.model.FileUploadMetaData;
import org.springframework.data.jpa.repository.JpaRepository;

/** A JPA repository used to perform crud operations on file meta data records in database*/
public interface FileUploadRepository extends JpaRepository<FileUploadMetaData, Long> {
}
