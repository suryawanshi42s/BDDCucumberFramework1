package LibraryFiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UtilityClass {
    public static String getPFData(String key) throws IOException {

        FileInputStream file=new FileInputStream("C:\\Users\\Shital\\IdeaProjects\\BDD_Cucumber_FrameworkIntegration\\src\\main\\java\\LibraryFiles\\PropertyFiles.properties");
        Properties p=new Properties();
        p.load(file);
        String value = p.getProperty(key);
        return value;
    }

}
