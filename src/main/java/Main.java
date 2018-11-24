import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;

public class Main {
    public static void main(String[] args) {

       Reader reader = new Reader();
       Printer printer = new Printer();

       printer.printLine("Wprowadź ilość imion, którą chcesz umieścić w tablicy");
       Integer arrayRange = reader.numberOfNames();
       String[] names =new String[arrayRange];
       printer.printLine("Wprowadź " + names.length + " imion:");

       for(int i=0; i<names.length; i++) {
           printer.printLine("Wprowadź " + (i+1) + " imię: ");
           String name = reader.getName();
           names[i] = name;
       }
    }
}
