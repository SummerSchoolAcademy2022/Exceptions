import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        try{
            throw new RuntimeException("Runtime from try!");
        }catch (RuntimeException ex){
            System.out.println(ex.getMessage());
            throw ex;
        }finally {
            System.out.println("Mesaj afisat din blocul finally");
            throw new RuntimeException("Runtime exception from finally!");
        }

        try (PrintWriter printWriter = new PrintWriter(new FileWriter("Output.txt"))){
            printWriter.write("Something");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
