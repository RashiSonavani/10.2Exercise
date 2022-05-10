package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class ShowFile
{

    public static void main(String[] args) throws IOException {


        int bajt;

        try (FileInputStream fis = new FileInputStream("showtime.txt"))
        {
            do
            {
                bajt = fis.read();
                if (bajt != -1) System.out.print((char) bajt);
            }

            while (bajt != -1);

        }

        catch (IOException e)
        {
            System.out.println("Error reading Tile");
        }
    }

}

