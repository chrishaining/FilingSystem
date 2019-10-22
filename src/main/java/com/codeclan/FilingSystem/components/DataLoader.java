package com.codeclan.FilingSystem.components;

import com.codeclan.FilingSystem.models.File;
import com.codeclan.FilingSystem.repositories.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    public void run(ApplicationArguments args) {

        File file1 = new File("Drawing", ".io", 32.5);
        fileRepository.save(file1);

        File file2 = new File("Guernica", ".jpeg", 30);
        fileRepository.save(file2);

    }
}
