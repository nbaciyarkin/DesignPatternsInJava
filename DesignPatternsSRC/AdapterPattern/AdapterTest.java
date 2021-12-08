package AdapterPattern;

import java.util.Scanner;

public class AdapterTest {

    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Printer type");
        String printerTypeInput= sc.nextLine();

        if(printerTypeInput.toLowerCase().equals("char")){
            Printable document1 = new Document();
            PrintableAdapter charByCharAdapter = new CharBYCharAdapterImplementation(document1);
            charByCharAdapter.getDocumnet();
        } else if(printerTypeInput.toLowerCase().equals("buffer")){
            Printable document2 = new Document();
            PrintableAdapter bufferAdapter = new BufferImplementationAdapter(document2);
            bufferAdapter.getDocumnet();
        }
        else{
            System.out.println("Please Enter Proper Adapter Type 'Buffer 'or 'Char'");
        }



    }
}
