package com.apimp3app.Mp3App.upload;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Map;

@RestController
@RequestMapping("/upload")
@CrossOrigin("*")

public class UploadController {

    @Autowired
    UploadService uploadService;

    @PostMapping("")
    public Map uploadFile(@RequestParam(name = "multipartFile") MultipartFile multipartFile,
                          @RequestParam String publicId,@RequestParam String typeFile,
                          @RequestParam String id) throws IOException {
        Upload upload = new Upload();
        upload.setId(id);
        upload.setMultipartFile(multipartFile);
        upload.setPublicId(publicId);
        upload.setTypeFile(typeFile);
        return uploadService.upload(upload);
    }

}
