package Listing7;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class list7_4 {
    public static void main(String[] args) {

        if ((args.length == 0) || (args.length > 2)) {
            System.out.println("Usage: java Grep <образец> <имя_файла>");
            System.exit(0);
        }

        try {
            FileInputStream fis = new FileInputStream(args[1]);
            list7_3.GrepInputStream gis=
                    new list7_3.GrepInputStream((InputStream) fis, args[0]);
            String line;
            for (;;) {
                line = gis.readLine();
                is (line == null) break;
                System.out.println(line);
            }
            gis.close();

        } catch (IOException ioe) {
            System.err.println(ioe.getMessage());
        }
    }
}
