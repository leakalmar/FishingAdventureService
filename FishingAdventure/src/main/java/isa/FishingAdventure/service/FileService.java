package isa.FishingAdventure.service;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import isa.FishingAdventure.model.FileStorage;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;

import java.net.MalformedURLException;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Base64;

@Service
public class FileService {

    private final Path fileStorageLocation;

    protected final Log logger = LogFactory.getLog(getClass());

    @Autowired
    public FileService(FileStorage fileStorageProperties) throws IOException {
        this.fileStorageLocation = Paths.get(System.getProperty(
                "user.dir") + "/images")
                .toAbsolutePath().normalize();
        try {
            Files.createDirectories(this.fileStorageLocation);
        } catch (FileNotFoundException ex) {

            logger.info("Could not find file.");

        }
    }

    public String storeFile(String imageString, String fileName) throws IOException {
        // create a buffered image
        BufferedImage image = null;
        byte[] imageByte;
        imageByte = Base64.getDecoder().decode(imageString.trim());
        ByteArrayInputStream bis = new ByteArrayInputStream(imageByte);
        image = ImageIO.read(bis);
        bis.close();

        // write the image to a file
        String targetLocation = this.fileStorageLocation.toString();
        ImageIO.write(image, "jpg",
                new File(targetLocation + "/" + fileName + ".jpg"));

        return fileName + ".jpg";
    }

    public Resource loadFileAsResource(String fileName) {
        try {
            Path filePath = this.fileStorageLocation.resolve(fileName).normalize();
            Resource resource = new UrlResource(filePath.toUri());
            if (resource.exists()) {
                return resource;
            } else {
                logger.info("File not found " + fileName);
            }
        } catch (MalformedURLException ex) {

            logger.info("File not found " + fileName);
        }
        return null;
    }

}
