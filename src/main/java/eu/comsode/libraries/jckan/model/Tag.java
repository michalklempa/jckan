package eu.comsode.libraries.jckan.model;

import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Represents a tag
 *
 * @author      Ross Jones <ross.jones@okfn.org>
 * @version     1.7
 * @since       2012-05-01
 */
public class Tag {

    private String display_name;

    private String id;

    private String name;

    private Date revision_timestamp;

    private String state;

    private String vocabulary_id;

    public Tag() {
    }

    public Tag(String display_name, String id, String name, Date revision_timestamp, String state, String vocabulary_id) {
        super();
        this.display_name = display_name;
        this.id = id;
        this.name = name;
        this.revision_timestamp = revision_timestamp;
        this.state = state;
        this.vocabulary_id = vocabulary_id;
    }

    public String getDisplay_name() {
        return display_name;
    }

    public void setDisplay_name(String display_name) {
        this.display_name = display_name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getRevision_timestamp() {
        return revision_timestamp;
    }

    public void setRevision_timestamp(Date revision_timestamp) {
        this.revision_timestamp = revision_timestamp;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getVocabulary_id() {
        return vocabulary_id;
    }

    public void setVocabulary_id(String vocabulary_id) {
        this.vocabulary_id = vocabulary_id;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
