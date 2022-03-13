package com.apimp3app.Mp3App.upload;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service

public class UploadService {

    Cloudinary cloudinary;

    private Map<String, String> valuesMap = new HashMap<>();

    public UploadService() {
        valuesMap.put("cloud_name", "ensonet-dev");
        valuesMap.put("api_key", "625767877926127");
        valuesMap.put("api_secret", "TSaPPlz96fO4w7hGf-Qtx3k25mo");
        cloudinary = new Cloudinary(valuesMap);
    }

    public Map upload(Upload upload) throws IOException {
        File file = convert(upload.getMultipartFile());
        Map result = cloudinary.uploader().upload(file, ObjectUtils.asMap(
                "public_id", upload.getPublicId() + upload.getId(),
                "overwrite", true,
                "resource_type", upload.getTypeFile()
        ));
        file.delete();
        return result;
    }

    public List<Map> uploadMulti(List<Upload> uploadList) throws IOException {
        List<Map> mapList = new ArrayList<>();
        for (Upload upload: uploadList) {
            mapList.add(upload(upload));
        }
        return mapList;
    }

    private File convert(MultipartFile multipartFile) throws IOException {
        File file = new File(multipartFile.getOriginalFilename());
        FileOutputStream fo = new FileOutputStream(file);
        fo.write(multipartFile.getBytes());
        fo.close();
        return file;
    }


}
