package sk.kosickaakademia.onofrej.files;

import java.io.*;
import java.nio.file.Files;

public class RWFile {
    public void copyFileWithCapital(String fileName){
        BufferedReader reader;
        try {
            if(new File(fileName).exists()==false){
                System.out.println("Problem : File "+fileName+" does not exist !");
                return;
            }
            FileReader fr = new FileReader(fileName);

            File file = new File("output/"+getFileName('b'));
            file.createNewFile();

            FileWriter fw = new FileWriter( file );

            reader=new BufferedReader(fr);
            String line;
            while((line=reader.readLine())!=null){
                line=line.toUpperCase();
                System.out.println(line);
                fw.write(line+"\n");
            }

            fr.close();
            fw.close();
        }catch(IOException ex){
            ex.printStackTrace();
        }

    }

    private String getFileName(char prefix){
        String name;
        //zmena, vygenerovat spravny nazov
        name=prefix+"_221054.txt";
        return name;

    }

    public void copyAndEncryptFile(String fileName){
        // c_hhmmss

        // Ahoj   + 3 znaky
        // koduju sa len pismena a cislice ( z->c, 7->0, Y->B, !->! #->#
        // vstup-> line -> char[] -> zmena/posun -> string -> zapis
    }
}
