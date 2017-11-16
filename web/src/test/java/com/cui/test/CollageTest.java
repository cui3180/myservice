package com.cui.test;

import com.cui.fs.model.Collage;
import com.cui.fs.api.CollageService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by cjs
 * Date： 2017/11/14.
 * Time： 14:00.
 */
public class CollageTest extends AbstractBaseTest {

    @Autowired
    private CollageService collageService;

    @Test
    public void index (){
        Collage collage=new Collage();
        collage.setSex(1);
        collage.setName("sfsf");
        collageService.addCollage(collage);

    }

}
