package com.example.demo.controllers;

import com.example.demo.service.FileUploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class FileUploadController {
    @Autowired
    FileUploadService fileUploadService;

    @PostMapping("/")
    public void uploadFile(@RequestParam("file") MultipartFile file) {
//        System.out.println("upload method before parse to fileUploadService");
        fileUploadService.uploadFile(file);
    }

    @GetMapping("/")
    public void greeting(){
        System.out.println("Hello");
    }
}
