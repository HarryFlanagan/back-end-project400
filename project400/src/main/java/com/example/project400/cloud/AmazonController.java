package com.example.project400.cloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

public class AmazonController {
    @Autowired
    private AmazonClient amazonClient;

    @Autowired
    public AmazonController(AmazonClient amazonClient) {
        this.amazonClient = amazonClient;
    }

    @PostMapping("/uploadFile")
    public ResponseEntity<String> uploadFile(@RequestPart(value = "file") MultipartFile file) {
        return new ResponseEntity<>(amazonClient.uploadFile(file), HttpStatus.OK);
    }
}
