package Day9_JSEScroll_Cookies_Files;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;

public class C8_FileExist {

    @Test
    public void FileExist() {
        //C:\\Users\\lenovo\\Desktop\\fileExist.png
        System.out.println(System.getProperty("user.home"));//home

        String homePath=System.getProperty("user.home");

        String filePath="\\Desktop\\fileExist.png";

        String fullPath=homePath+filePath;

        System.out.println(fullPath);

       File image=new File(fullPath);

        Assert.assertTrue(image.exists());

    }
}
