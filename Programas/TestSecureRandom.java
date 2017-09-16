package seginfo;

import java.security.SecureRandom;
import java.io.FileWriter;

public class TestSecureRandom {
    
    public static void main(String[] args)
    {
        SecureRandom r = new SecureRandom();
        String strTexto = "";
        int i;
        FileWriter writer;
        
        for(i=0; i < 1000000; i++)
        {
            strTexto = strTexto + String.valueOf(r.nextInt(2));
            System.out.println(i);
        }
        
        //Escrever o texto num arquivo
        try
        {
        writer = new FileWriter("java_secureRandom.txt");
        writer.write(strTexto);
        writer.close();
        }
        catch(Exception e)
        {
            System.out.println("Erro na manipulação do arquivo de saída");
        }
        
    }
    
}
