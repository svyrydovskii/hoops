package org.basketball.media;

import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;
import org.basketball.domain.Picture;
import org.basketball.repos.PictureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.io.ByteArrayInputStream;

@Component
public class ImageManager {

    @Autowired
    PictureRepository pictureRepository;
    //@Autowired
    AmazonS3Client s3;
    private String bucketName = "bucketname";

    @Transactional
    public String saveAndUpload(Picture image) {
        if (image.getContent() == null) {
            return null;
        }
        Picture saved = pictureRepository.save(image);
        String key = saved.getId().toString();
        PutObjectRequest putObjectRequest = new PutObjectRequest(bucketName, key, new ByteArrayInputStream(image.getContent()), new ObjectMetadata());
        s3.putObject(putObjectRequest.withCannedAcl(CannedAccessControlList.PublicRead));
        String link = s3.getResourceUrl(bucketName, key);
        saved.setLink(link);
        pictureRepository.saveAndFlush(saved);
        return link;
        //todo fix that the link is for the download of file, but not upload. also image type is missing
    }

}
