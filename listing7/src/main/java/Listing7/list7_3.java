package Listing7;

import java.io.*;

public class list7_3 {
    class GrepInputStream extends FileInputStream {
        String substring = null;
        BufferedReader br;

        public GrepInputStream(InputStream in, String substring) {
            super(in);
            this.br = new BufferedReader(new
                    InputStreamReader(in));
            this.substring = substring;
        }

        public final String readLine() throws IOException {

            String line;
            do {
                line = br.readLine();
            } while ((line != null) && line.indexOf(substring) == -1);
            return line;

            do {
                line = br.readLine();
            } while ((line != null) && line.indexOf(substring) == -1);
            return line;
        }
    }
}
