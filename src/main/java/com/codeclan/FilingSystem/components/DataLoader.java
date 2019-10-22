package com.codeclan.FilingSystem.components;

import com.codeclan.FilingSystem.models.File;
import com.codeclan.FilingSystem.models.Folder;
import com.codeclan.FilingSystem.models.User;
import com.codeclan.FilingSystem.repositories.FileRepository;
import com.codeclan.FilingSystem.repositories.FolderRepository;
import com.codeclan.FilingSystem.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public void run(ApplicationArguments args) {

        User user1 = new User("Amstel");
        userRepository.save(user1);

        Folder folder1 = new Folder("Artwork", user1);
        folderRepository.save(folder1);

        File file1 = new File("Drawing", ".io", 32.5, folder1);
        fileRepository.save(file1);

        File file2 = new File("Guernica", ".jpeg", 30, folder1);
        fileRepository.save(file2);



    }
}
