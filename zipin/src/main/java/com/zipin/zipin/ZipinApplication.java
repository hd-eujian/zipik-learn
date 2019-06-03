package com.zipin.zipin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;
import zipkin.server.EnableZipkinServer;
@EnableZipkinStreamServer
//@EnableZipkinServer
@SpringBootApplication
public class ZipinApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZipinApplication.class, args);
    }

}
