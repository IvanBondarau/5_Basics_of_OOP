package by.java_tutorial.week5.basics_of_oop.task1;

public class TextFile extends File {

    protected String content;
    protected Directory parentDir;
    protected boolean created;

    public TextFile(String name, Directory parentDir) {
        super(name);

        this.parentDir = parentDir;
        this.created = false;
    }

    public void create() {
        this.content = "";
        this.created = true;
    }

    public void create(String content) {
        this.content = content;
        this.created = true;
    }

    public void delete() {
        created = false;
    }

    public boolean isCreated() {
        return created;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Directory getParentDir() {
        return parentDir;
    }

    public void setParentDir(Directory parentDir) {
        this.parentDir = parentDir;
    }

    public void add(String text) {
        content += text;
    }

    public void printContent() {
        System.out.println(content);
    }


    public void clear() {
        this.content = "";
    }

    @Override
    public String toString() {
        return "Directory: " + parentDir.getName() + "\n"
                + "Name: " + name + "\n"
                + "\"\"\"\n" + (content == null ? "Doesn't exist " : content) + "\n\"\"\"";
    }


}
