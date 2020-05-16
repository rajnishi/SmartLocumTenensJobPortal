package BasePage;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadFromPropFile {

    public String path = System.getProperty("user.dir");
    public FileInputStream fileInputStream;
    public Properties properties;

    public ReadFromPropFile(String fileName){
        properties = new Properties();
        try{
            fileInputStream = new FileInputStream(path + "//src//main//resources//" + fileName);
            properties.load(fileInputStream);
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    //*****************LoginPage********************//

    public String getUrl(){ return properties.getProperty("url");    }
    public String getBrowser(){ return properties.getProperty("browser");  }
    public String getEmail(){ return properties.getProperty("email");    }
    public String getPwd(){ return properties.getProperty("password");    }
    public String getPath(){return properties.getProperty("loadDriverPath");    }

    //************************Registration Page + Profile Page************************//

    public String getFacilityName(){return properties.getProperty("facilityName");    }
    public String getFirstName(){return properties.getProperty("firstName");    }
    public String getLastName(){return properties.getProperty("lastName");    }
    public String getEmail1(){return properties.getProperty("email1");    }
    public String getphone(){return properties.getProperty("phone");    }
    public String getDept(){return properties.getProperty("dept");    }
    public String getAddress(){return properties.getProperty("address");    }
    public String getCity(){return properties.getProperty("city");    }
    public String getState(){return properties.getProperty("state");    }
    public String getZip(){return properties.getProperty("zip");    }

    //********************CredentialDocs and Credentialing Info Page*************************//
    public String getDesc(){return properties.getProperty("desc");    }
    public String getLicense(){return properties.getProperty("license");    }
    public String getDEA(){return properties.getProperty("dea");    }
    public String getNPINumber(){return properties.getProperty("npinumber");    }

    public String getCarrier(){return properties.getProperty("carrier");    }
    public String getInsuranceAddress(){return properties.getProperty("insuranceaddress");    }
    public String getInsuranceCity(){return properties.getProperty("insurancecity");    }
    public String getInsuranceZip(){return properties.getProperty("insurancezip");    }
    public String getPolicyNum(){return properties.getProperty("policynum");    }
    public String getPolicyLimit(){return properties.getProperty("policylimit");    }
    public String getAggregate(){return properties.getProperty("aggregate");    }
    public String getPlaintiffFN(){return properties.getProperty("plaintiffFN");    }
    public String getPlaintiifM(){return properties.getProperty("plaintiifM");    }
    public String getPlaintiiLN(){return properties.getProperty("plaintiffLN");    }
    public String getAmtPaid(){return properties.getProperty("amtpaid");    }
    public String getPhone(){return properties.getProperty("phone");    }
    public String getInstiAddress(){return properties.getProperty("Instiaddress");    }
    public String getInstiCity(){return properties.getProperty("Insticity");    }
    public String getInstiZip(){return properties.getProperty("Instizip");    }

    public String getInstiName(){return properties.getProperty("institutionname");    }

    //***************************************************************************************//
    public static void main(String[] args) {
        ReadFromPropFile readFromPropFileRegiProObj = new ReadFromPropFile("RegiProfileConfig.properties");
        ReadFromPropFile readFromPropFileConfigObj = new ReadFromPropFile("Config.properties");

        System.out.println("Print last name: " + readFromPropFileRegiProObj.getLastName());
        System.out.println("Browser Name: " + readFromPropFileConfigObj.getBrowser());
    }
}
