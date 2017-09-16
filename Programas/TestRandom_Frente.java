package seginfo;

import java.util.Random;
import java.io.FileWriter;

public class TestRandom_Frente {
    
    public static void main(String[] args)
    {
        Random r = new Random();
        String strTexto = "";
        String strTextoInt = "";
        int i;
        FileWriter writer;
        
        for(i=1; i <= 1000000; i++)
        {
            strTextoInt = String.valueOf(r.nextInt(2)) + strTextoInt;
            
            if((i%100000)==0)
            {
                strTexto = strTextoInt + strTexto;
                strTextoInt = "";
            }
            
            System.out.println(i);
        }
        
        //Escrever o texto num arquivo
        try
        {
        writer = new FileWriter("java_random_frente.txt");
        writer.write(strTexto);
        writer.close();
        }
        catch(Exception e)
        {
            System.out.println("Erro na manipulação do arquivo de saída");
        }
        
    }
    
}
