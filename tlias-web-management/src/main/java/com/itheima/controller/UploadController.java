package com.itheima.controller;

import com.itheima.pojo.Result;
import com.itheima.utils.AliOSSUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * @author chb
 * @since 2024/03/21
 */
@Slf4j
@RestController
public class UploadController {
    @Autowired
    private AliOSSUtils ossUtils;

    @PostMapping("/upload")
    public Result upload(MultipartFile image) throws IOException {
        String url = ossUtils.upload(image);

        log.info("图片上传完成，url={}",url);
        return Result.success(url);
    }
}