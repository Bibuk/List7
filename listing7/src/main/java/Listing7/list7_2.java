package Listing7;

import java.io.IOException;

public class List7_2 {
    File file = new File("file.bin");
    InputStream is = new FileInputStream(file);

    long length = file.length();

    /* Нельзя создать байтовый массив с количеством элементов большим, чем значение Integer.MAX_VALUE.
   Если размер файла в байтах больше этого значения, файл нельзя прочитать */

    if (length > Integer.MAX_VALUE) {
            /* если размер файла слишком большой для чтения,
       будет сгенерировано исключение. */
        throw new IOException("Файл " + file.getName() + " слишком длинный!");
    }
    byte[] bytes = new byte[(int)length];

    int offset = 0;
    int numRead = 0;
    while (offset < bytes.length &&
            (numRead=is_read(bytes, offset, bytes.length-offset)) >= 0)   {

        offset += numRead;
    }
    if  (offset < byte.length) {
        throw new IOException("Не удалось прочитать файл" + file.getName() + " Целиком.");
    }
     is.close();
