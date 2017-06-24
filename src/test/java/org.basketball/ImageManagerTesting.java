package org.basketball;

import org.basketball.domain.Picture;
import org.basketball.media.ImageManager;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.io.RandomAccessFile;

/**
 * Created by Andrii Svyrydovskyi on 17/10/2016.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
@DataJpaTest
public class ImageManagerTesting {

    @Autowired
    ImageManager imageManager;

    @Test
    public void testUpload() throws Exception {
        Picture picture = new Picture();
        File file = new File("C:\\Users\\Drew\\Desktop\\Pics\\jN57tGt.png");

        RandomAccessFile f = new RandomAccessFile("C:\\Users\\Drew\\Desktop\\Pics\\jN57tGt.png", "r");
        byte[] b = new byte[(int) f.length()];
        f.readFully(b);
        picture.setContent(b);
        System.out.println(imageManager.saveAndUpload(picture));


    }


}
