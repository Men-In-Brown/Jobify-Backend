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
    private String filepath;

    @Column()
    private boolean uploaded;

    @Column()
    private String uploaderUsername;

    @Column()
    private String description;

    public String getOriginalFilename() { 
        return filename; 
    }

    public void setOriginalFilename(String filename) { 
        this.filename = filename; 
    }

    public String getAbsolutePath() { 
        return filepath; 
    }

    public void setAbsolutePath(String filepath) { 
        this.filepath = filepath; 
    }

    public FileUpload(String filename, String filepath, String uploaderUsername, String description) {
        this.filename = filename;
        this.filepath = filepath;
        this.uploaded = true;
        this.uploaderUsername = uploaderUsername;
        this.description = description;
    }
}