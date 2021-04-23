package com.example.demo.controllers;

import com.example.demo.service.FileUploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
public class FileUploadController {
    @Autowired
    FileUploadService fileUploadService;

    @PostMapping("/")
    public void uploadFile(@RequestParam("file") MultipartFile file) {
//        System.out.println("upload method before parse to fileUploadService");
        try {
            fileUploadService.uploadFile(file);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    @GetMapping("/")
    public void greeting() {
        System.out.println("Hello This is GetMapping");
    }
}
