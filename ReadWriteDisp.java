import java.io.*;
import java.util.Scanner;

public class ReadWriteDisp {
public static void main(String[] args) {
String fileName, content;
Scanner sc = new Scanner(System.in);
System.out.print("Enter the Name of File: ");
fileName = sc.nextLine();
try {
FileWriter f1 = new FileWriter(fileName);
System.out.println("\nEnter the Content (Type 'EOF' on a new line to stop):");
while (true) {
content = sc.nextLine();
if (content.equals("EOF")) {
break;
}
f1.write(content + "\n");
}
f1.close();
System.out.println("\nContent written to the file successfully.");
} catch (IOException ioe) {
System.out.println("\nException during writing: " + ioe);
}
try {
FileReader fr = new FileReader(fileName);
Scanner fileScanner = new Scanner(fr);
System.out.println("\nContent of the file:");
while (fileScanner.hasNextLine()) {
content = fileScanner.nextLine();
System.out.println(content);
}
fileScanner.close();
fr.close();
} catch (IOException ioe) {
System.out.println("\nException during reading: " + ioe);
}
sc.close();
}
}
