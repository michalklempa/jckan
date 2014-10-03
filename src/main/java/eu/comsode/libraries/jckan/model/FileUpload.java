package eu.comsode.libraries.jckan.model;

import java.io.File;

public class FileUpload extends Upload {
    private File file;

    public FileUpload() {
        super();
    }

    public FileUpload(File file) {
        super();
        this.file = file;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
}
