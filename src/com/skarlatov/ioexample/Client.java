package com.skarlatov.ioexample;

import java.io.*;

public class Client {

    public static void main(String[] args) throws FileNotFoundException {
        int c;

        StringBuffer sb = new StringBuffer("aaALEXaAAAaaabbbBBBBbbbbcccCCCc");
        byte[] bytes = sb.toString().getBytes();
        try{
//            InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("test.txt")));


            InputStream in = new LowerCaseInputStream(new ByteArrayInputStream(bytes));

            while((c = in.read()) >= 0   ){
                System.out.print((char)c);
            }

            in.close();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        finally {
//            in.close();
        }
    }
}
