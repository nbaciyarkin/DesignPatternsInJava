package AdapterPattern;

public class CharBYCharAdapterImplementation implements PrintableAdapter{

    private Printable sentence;

    public CharBYCharAdapterImplementation(Printable sentence) {
        this.sentence = sentence;
    }

    @Override
    public String getDocumnet() {
        return convertCharByChar(this.sentence.getDocumnet());
    }

    private String convertCharByChar(String sentence ){
        int size = sentence.length();

        for(int i = 0; i<size; i++){
            System.out.println(sentence.charAt(i));
        }
        return "CharByCharConverted";
    }

}
