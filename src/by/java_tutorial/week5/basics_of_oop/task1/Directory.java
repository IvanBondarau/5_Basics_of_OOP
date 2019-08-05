package by.java_tutorial.week5.basics_of_oop.task1;

import java.util.ArrayList;

public class Directory extends File {

    protected ArrayList<File> files;

    public Directory(String name) {

        super(name);

        files = new ArrayList<>();
    }

    public void addFile(File file) {
        files.add(file);
    }

    public ArrayList<File> getFiles() {
        return files;
    }

    public void setFiles(ArrayList<File> files) {
        this.files = files;
    }

    public File search(String fileName) {
        for (var file: files) {
            if (file.getName().equals(fileName)) {
                return file;
            }
        }

        return null;
    }


}
