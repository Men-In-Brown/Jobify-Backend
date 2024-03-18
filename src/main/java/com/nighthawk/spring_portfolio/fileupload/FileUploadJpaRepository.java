package com.nighthawk.spring_portfolio.fileupload;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface FileUploadJpaRepository extends JpaRepository<FileUpload, Long> {
    // Finds files uploaded by a specific user
    List<FileUpload> findByUploaderUsername(String uploaderUsername);
    
    // Finds files uploaded with a specific description
    List<FileUpload> findByDescription(String description);
    
    // Finds files uploaded by a specific user with a specific description
    List<FileUpload> findByUploaderUsernameAndDescription(String uploaderUsername, String description);
    
    // Finds files uploaded by a specific user with a description containing a certain keyword
    List<FileUpload> findByUploaderUsernameAndDescriptionContaining(String uploaderUsername, String keyword);
    
    // Finds files uploaded before a specific date
    List<FileUpload> findByUploadedDateBefore(Date date);
    
    // Finds files uploaded after a specific date
    List<FileUpload> findByUploadedDateAfter(Date date);
    
    // Finds files uploaded between two dates
    List<FileUpload> findByUploadedDateBetween(Date startDate, Date endDate);
    
    // Finds files uploaded and sorts them by filename in ascending order
    List<FileUpload> findByOrderByFilenameAsc();
    
    // Finds files uploaded and sorts them by upload date in descending order
    List<FileUpload> findByOrderByUploadedDateDesc();
    
    // Counts the total number of uploaded files by a specific user
    long countByUploaderUsername(String uploaderUsername);

    FileUpload save(FileUpload fileUpload);
}
