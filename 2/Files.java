package GeekForGeeksOrazInne;

import java.io.File;

public class Files {
    public static void main(String[] args) {
        //defining path to test the methods
        String filePath = "C:\\git-projekty";

        File[] files = new File(filePath).listFiles();
        displayFiles(files);

        File file = new File(filePath);
        System.out.println(folderSize(file)/1024 + " KB");

        //print user working directory
        System.out.println("Working directory: " + System.getProperty("user.dir"));

        findFile(file, "abc.txt");
    }

    static void displayFiles(File[] files) {
        for (File file: files) {
            if(file.isDirectory()) {
                System.out.println("Directory: " + file.getName());
                displayFiles(file.listFiles());
            }
            else {
                System.out.println("File: " + file.getName());
            }
        }
    }

    static long folderSize(File folder) {
        File[] files = folder.listFiles();
        long size = 0;
        for(int i = 0; i < files.length; i++) {
            if(files[i].isFile()) {
                size += files[i].length();
            } else {
                size += folderSize(files[i]);
            }
        }
        return size;
    }

    static void deleteFile(File file) {
        for(File subFile: file.listFiles()) {
            if(subFile.isDirectory()) {
                deleteFile(subFile);
            }
            subFile.delete();
        }
    }

    static void findFile(File files, String file) {
        String[] fileList = files.list();
        int flag = 0;
        if (fileList == null) {
            System.out.println("empty directory");
        } else {
            for (int i = 0; i < fileList.length; i++) {
                String fileName = fileList[i];
                if (fileName.equalsIgnoreCase(file)) {
                    System.out.println("found file: " + fileName);
                    flag = 1;
                }
            }
        }
        if (flag == 0) {
            System.out.println("File not found");
        }
    }
}
