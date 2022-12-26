package Day9_JSEScroll_Cookies_Files;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C7_FileExist {
    public static void main(String[] args) {
        System.out.println(System.getProperty("user.dir")); //projemizin rootunun yolunu verir

        String projectRoot=System.getProperty("user.dir");//bulmak istediğimiz file proje içerisinde olduğundan pruje yolunu aladık

        String filePath="\\src\\test\\java\\resources\\fileExist.jpg";//bulmak isteddiğimiz dosyanın proje klosöründen sonraki yolunu aldık (copy

        filePath=projectRoot+filePath;//almış olduğumuz 2 yolu birleştirip absolute path imizi elde etttik

        System.out.println(Files.exists(Paths.get(filePath)));//bu path de bir dosya olup olmadıgını doğruladık

        if (Files.exists(Paths.get(filePath))){
            System.out.println("Dosya bulundu");//varsa bunu yazdırdık
        }else {
            System.out.println("Dosya bulunamadı");//yoksa bunu yazdırdık
        }


    }
}
