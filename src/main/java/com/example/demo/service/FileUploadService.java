package com.example.demo.service;

import org.apache.commons.io.FilenameUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Service
public class FileUploadService {

    public void uploadFile(MultipartFile file) {
        try {
//  ##          รับค่ามาว่า Home อยู่ที่ไหน
            String home = System.getProperty("user.home");
//            System.out.println("Home : " + home);
//  ##           ย้ายไฟล์ไปที่รับเข้ามา ไปเก็บใน Folder นั้นๆ
            file.transferTo(new File(FilenameUtils.normalize(home + "/Desktop/Picture/" + file.getOriginalFilename())));
            System.out.println("Upload Success Fully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
