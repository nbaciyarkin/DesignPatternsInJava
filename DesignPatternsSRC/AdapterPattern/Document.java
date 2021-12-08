package AdapterPattern;


import java.util.Scanner;

public class Document implements Printable {

    @Override
    public String getDocumnet() {
         return writeSentence();
    }

    public String writeSentence() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str= sc.nextLine();
        return str;
    }


}
