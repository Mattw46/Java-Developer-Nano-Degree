package com.example.springbootfileupload.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RestController
public class UploadController {
    Map<String, Object> result = new HashMap<>();
    /// Receive message
    @RequestMapping(value="/uploadFile", method = RequestMethod.POST)
    public Map<String, Object> upload(@RequestParam("attach") MultipartFile file) throws IOException {
        // File info
        System.out.println("File name = "  + file.getOriginalFilename());
        System.out.println("File type = " + file.getContentType());
        

        String destPath = "upload/";
        File filePath = new File(destPath);
        File dest = new File(filePath.getAbsolutePath(), file.getOriginalFilename());
        if (!filePath.exists()) {
            filePath.mkdirs();
        }
        try {
            file.transferTo(dest);
            System.out.println("File successfully uploaded");
        } catch (IOException e) {
            System.out.println("File upload failed");
        }

        result.put("Success", true);
        return result;
    }
}
