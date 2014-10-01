package eu.comsode.libraries.jckan.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Error {
    private String __type;

    private String[] id;

    public String get__type() {
        return __type;
    }

    public void set__type(String __type) {
        this.__type = __type;
    }

    public String[] getId() {
        return id;
    }

    public void setId(String[] id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
