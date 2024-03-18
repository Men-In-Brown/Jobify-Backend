package com.nighthawk.spring_portfolio.fileupload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
import java.util.HashMap;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class FileUpload {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column()
    private String filename;

    @Column()
    private String filePath;

    @Column()
    private boolean uploaded;

    @Column()
    private String uploaderUsername;

    @Column()
    private String description;

    // Additional properties as needed

    public FileUpload(String filename, String filePath, String uploaderUsername, String description) {
        this.filename = filename;
        this.filePath = filePath;
        this.uploaded = true;
        this.uploaderUsername = uploaderUsername;
        this.description = description;
    }
}
