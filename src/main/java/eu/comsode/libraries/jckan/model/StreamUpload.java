package eu.comsode.libraries.jckan.model;

import java.io.InputStream;

public class StreamUpload extends Upload {
    private InputStream inputStream;

    private String filename;

    public StreamUpload() {
    }

    public StreamUpload(String filename, InputStream inputStream) {
        this.filename = filename;
        this.inputStream = inputStream;
    }

    public InputStream getInputStream() {
        return inputStream;
    }

    public void setInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
}
