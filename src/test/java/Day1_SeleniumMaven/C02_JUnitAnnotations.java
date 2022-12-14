package Day1_SeleniumMaven;

import org.junit.*;

public class C02_JUnitAnnotations {
    //1.test
    //2.test
    //3.test
    //4. test (gelistirme asamasinda bu yuzden rapora dahil olmasin)
    //her testimizden önce ve sonra calısması gereken kod bloklarımız var
    //tüm testlerin öncesinde ve sonrasın da calısması gereken methodlarımız var

    //        1. @Test -> Marks a method as a TEST CASE.
//        2. @Before : Runs before EACH @Test annotation.
//        3. @After : Runs after EACH @Test annotation.
//        4. @BeforeClass : Runs before each class only once.
//        5. @AfterClass : Runs after each class only once.
//        6. @Ignore : Skipping a test case.
    @Test
    public void test01(){
        System.out.println("1. Test yapılıyor");
    }
    @Test
    public void test02(){
        System.out.println("2. Test yapılıyor");
    }
    @Test
    public void test03(){
        System.out.println("3. Test yapılıyor");
    }
    @Ignore
    @Test
    public void test04(){
        System.out.println("4. Test geliştirme asamasında");
    }
    @Before
    public void beforeEach(){
        System.out.println("Method öncesi kod blogu calişti");
    }
    @After
    public void afterEach(){
        System.out.println("Method sonrası kod blogu calişti");
    }
    @BeforeClass
    public static void beroreAll(){
        System.out.println("Methodların öncesindeki kod blogu calişti");
    }
    @AfterClass
    public static void afterAll(){
        System.out.println("Methodların sonrasıdaki kod blogu calişti");
    }
}
