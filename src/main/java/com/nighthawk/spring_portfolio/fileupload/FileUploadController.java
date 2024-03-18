package com.nighthawk.spring_portfolio.fileupload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RestController
@RequestMapping("/api/uploads")
public class FileUploadController {

    @Autowired
    private FileUploadRepository fileUploadRepository;

    @PostMapping("/upload")
    public ResponseEntity<Object> uploadFile(@RequestParam("file") MultipartFile file,
                                             @RequestParam("description") String description,
                                             @RequestParam("uploaderUsername") String uploaderUsername) {
        if (file.isEmpty()) {
            return new ResponseEntity<>("Please select a file to upload", HttpStatus.BAD_REQUEST);
        }

        try {
            // Save the uploaded file to a location on the server
            File convertedFile = new File("uploads/" + file.getOriginalFilename());
            FileOutputStream fos = new FileOutputStream(convertedFile);
            fos.write(file.getBytes());
            fos.close();

            // Save file details to database
            FileUpload savedFile = FileUploadJpaRepository.save(new FileUpload(file.getOriginalFilename(), convertedFile.getAbsolutePath(), true, uploaderUsername, description));
            return new ResponseEntity<>("File uploaded successfully with ID: " + savedFile.getId(), HttpStatus.CREATED);
        } catch (IOException e) {
            return new ResponseEntity<>("Failed to upload file: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
