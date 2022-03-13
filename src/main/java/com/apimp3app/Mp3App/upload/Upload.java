package com.apimp3app.Mp3App.upload;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter

public class Upload {

    String id;
    String publicId;
    MultipartFile multipartFile;
    String typeFile;

}
