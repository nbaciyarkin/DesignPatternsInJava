package AdapterPattern;

public class BufferImplementationAdapter implements PrintableAdapter {
    private Printable sentence;

    public BufferImplementationAdapter(Printable sentence) {
        this.sentence = sentence;
    }

    @Override
    public String getDocumnet() {
        return convertAsBuffer(this.sentence.getDocumnet());
    }

    private String convertAsBuffer(String sentence){
        int size = sentence.length();
        int i;

        for(i= 0; i<=size-2; i=i+3){ // system print 3 by 3 like a buffer

            if(i == size-2){
                String lastStr = String.valueOf(sentence.charAt(i)) + String.valueOf(sentence.charAt(i+1)); // if remind 2 digit when the system goes 3 by 3
                System.out.println(lastStr);
            }else {
                String str = String.valueOf(sentence.charAt(i)) + String.valueOf(sentence.charAt(i+1) + String.valueOf(sentence.charAt(i+2)));
                System.out.println(str);
            }
        }
        return "AsBufferPrinter";
        }

    }



