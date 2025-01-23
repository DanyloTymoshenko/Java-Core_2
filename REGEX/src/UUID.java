
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UUID {
    public static void main(String[] args) {
        String text = "app=edi_adapter_converter wingtipsTrace=8faeae6709355291 INFO  OrderCreateClient - action=EDIOrderSent originalFilename=Integration_test_Contract customerName=0005084863 orderUUID=d34149d8-88ab-4791-bb0a-46c96e034200 poNum=Test_TS5155079515 lineCount=3";

        String regex = "\\borderUUID\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);


        if (matcher.find()) {
            String foundSubstring = matcher.group(); // Find and return orderUUID substring from string
            System.out.println("True  at position " + matcher.start()); // Find and return true if String contains orderUUID
            System.out.println("Substring " + foundSubstring);
        } if(!matcher.find()) {
            System.out.println("False" + matcher.group() + " at position " + matcher.start()); // Find and return false if String does not contain orderUUID
        }

        // Find Email string
        String email = "test 2667843 (test_email@griddynamics.com) test 67483 some string ";
        String regex1 = "\\btest_email@griddynamics.com\\b";
        Pattern pattern1 = Pattern.compile(regex1);
        Matcher matcher1 = pattern1.matcher(email);

        while (matcher1.find()) {
            System.out.println(matcher1.group());
        }

        // find and return how many orders were created

        String findnumber = "app=edi_adapter_splitter wingtipsTrace=225debfbe6e5fac7 poiFileName=Integration_test_Contract INFO  LogUtils - POI file name: [Integration_test_Contract], total number of orders successfully processed: [2]";
        String regex2 = "\\[(\\d+)]";
        Pattern pattern2 = Pattern.compile(regex2);
        Matcher matcher2 = pattern2.matcher(findnumber);
        if (matcher2.find()) {
            String number = matcher2.group(1);
            System.out.println(number + " orders were created");
        } else {
            System.out.println("Number not found");
        }
    }
}