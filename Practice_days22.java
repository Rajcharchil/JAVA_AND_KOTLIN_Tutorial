


1. Java Program to Create a String from Contents of a File


  
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileToString {
    public static void main(String[] args) {
        try {
            String content = new String(Files.readAllBytes(Paths.get("file.txt")));
            System.out.println(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
2. Java Program to Append Text to an Existing File


  
import java.io.FileWriter;
import java.io.IOException;

public class AppendToFile {
    public static void main(String[] args) {
        String filePath = "file.txt";
        String textToAppend = "This is the appended text.";

        try (FileWriter fw = new FileWriter(filePath, true)) {
            fw.write(textToAppend);
            fw.write(System.lineSeparator()); // to add a newline
            System.out.println("Text appended successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



3. Java Program to Convert a Stack Trace to a String


  
import java.io.PrintWriter;
import java.io.StringWriter;

public class StackTraceToString {
    public static String getStackTraceAsString(Throwable throwable) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        throwable.printStackTrace(pw);
        return sw.toString();
    }

    public static void main(String[] args) {
        try {
            int result = 1 / 0;  // This will cause an exception
        } catch (ArithmeticException e) {
            String stackTrace = getStackTraceAsString(e);
            System.out.println("Stack Trace as String:\n" + stackTrace);
        }
    }
}



4. Java Program to Convert File to byte array and Vice-Versa
Convert File to byte array:



import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class FileToByteArray {
    public static byte[] convertFileToByteArray(String filePath) throws IOException {
        File file = new File(filePath);
        return Files.readAllBytes(file.toPath());
    }

    public static void main(String[] args) {
        try {
            byte[] fileData = convertFileToByteArray("file.txt");
            System.out.println("File converted to byte array: ");
            for (byte b : fileData) {
                System.out.print(b + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}





Convert byte array to File:



import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayToFile {
    public static void convertByteArrayToFile(byte[] data, String outputPath) throws IOException {
        File file = new File(outputPath);
        try (FileOutputStream fos = new FileOutputStream(file)) {
            fos.write(data);
        }
        System.out.println("Byte array converted to file successfully.");
    }

    public static void main(String[] args) {
        byte[] data = {65, 66, 67, 68};  // example byte data
        try {
            convertByteArrayToFile(data, "output.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}







5. Java Program to Convert InputStream to String


  
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamToString {
    public static String convertInputStreamToString(InputStream inputStream) throws IOException {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line).append(System.lineSeparator());
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;  // example using System.in
        String result = convertInputStreamToString(inputStream);
        System.out.println("Converted InputStream to String: " + result);
    }
}







6. Java Program to Convert OutputStream to String
Note: Java does not directly support converting OutputStream to String since OutputStream is generally for writing data. However, you can use ByteArrayOutputStream as an intermediary to convert the data back to a string.



  
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamToString {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        String data = "This is a test string.";

        // Write to the output stream
        outputStream.write(data.getBytes());

        // Convert output stream to string
        String result = outputStream.toString();
        System.out.println("Converted OutputStream to String: " + result);

        // Close the stream
        outputStream.close();
    }
}
7. Java Program to Lookup enum by String value


  
public class EnumLookupExample {

    enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
        
        public static Day fromString(String day) {
            try {
                return Day.valueOf(day.toUpperCase());
            } catch (IllegalArgumentException e) {
                System.out.println("No enum constant for the value: " + day);
                return null;
            }
        }
    }

    public static void main(String[] args) {
        String dayString = "monday";
        Day day = Day.fromString(dayString);

        if (day != null) {
            System.out.println("Enum value for " + dayString + " is " + day);
        }
    }
}
