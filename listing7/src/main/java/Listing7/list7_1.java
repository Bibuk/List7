package Listing7;

public class List7_1 {
    public static void deleteDir(String dirPath) {

        File walkDir = new File(dirPath); // удаляемая папка

        File dirList = walkDir.listFiles();// список элементов в папке


        if (dirList != null) {
            for (File f : dirList) {
                if (f.isDirectory()) {
                    deleteDir(f.getPath());  // если текущий элемент - папка
                } else {
                    f.delete();
                }
            }

        }
    }
     walkDir.delete();
}