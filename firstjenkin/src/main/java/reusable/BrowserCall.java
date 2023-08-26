package reusable;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BrowserCall {

        public static WebDriver driver;
        public static  Properties p;
        static public boolean bb;

        public   static String username=null;
        public static String pass=null;
        public static String search=null;
        public static String URL;
        public static    FileInputStream exelfile;

        public static XSSFWorkbook workbook;

        public static XSSFSheet sheet;
        public  static int count=0;
        //public static XSSFSheet sheet2;
        //public static XSSFSheet sheet3;
        public static WebDriver Browserinvocation() throws IOException {

            //driver=new EdgeDriver();
            String path=System.getProperty("user.dir");




            //driver=new ChromeDriver();



            FileInputStream fileInputStream=new FileInputStream(new File(path+"\\src\\main\\resources\\Utility\\enviroment.properties"));
            p=new Properties();
            p.load(fileInputStream);
            if(p.getProperty("browser").equalsIgnoreCase("chrome"))
            {
                driver=new ChromeDriver();

            }else if (p.getProperty("browser").equalsIgnoreCase("edge"))
            {
                driver=new EdgeDriver();


            }else throw new InvalidArgumentException("not a selected browser");

            driver.manage().window().maximize();
           // fetchdata();
            driver.get(p.getProperty("url"));
            //driver.navigate().refresh();
            //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            return driver;
        }
        public  static void Browsercall()

        {

            driver.close();
        }

        public static void fetchdata() throws IOException {
            exelfile= new FileInputStream(new File("C:/Users/Lenovo/Documents/GitHub/ucumberjherkinsss/cucumberjherkinsss/src/main/resources/testdataa/Testdata.xlsx"));
            workbook=new XSSFWorkbook(exelfile);
            sheet=workbook.getSheet("credentails");
            username=sheet.getRow(0).getCell(0).getStringCellValue();
            pass=sheet.getRow(0).getCell(1).getStringCellValue();
            sheet=workbook.getSheet("search");
            search=sheet.getRow(1).getCell(0).getStringCellValue();
            sheet=workbook.getSheet("URL");
            URL=sheet.getRow(0).getCell(0).getStringCellValue();




        }

    }

