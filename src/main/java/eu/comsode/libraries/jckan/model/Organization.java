package eu.comsode.libraries.jckan.model;

import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Organization {
    private String approval_status;

    private Date created;

    private String description;

    private String id;

    private String image_url;

    private Boolean is_organization;

    private String name;

    private String revision_id;

    private Date revision_timestamp;

    private String state;

    private String Title;

    private String type;

    public Organization() {
    }

    public Organization(String approval_status, Date created, String description, String id, String image_url, Boolean is_organization, String name, String revision_id, Date revision_timestamp, String state, String title, String type) {
        super();
        this.approval_status = approval_status;
        this.created = created;
        this.description = description;
        this.id = id;
        this.image_url = image_url;
        this.is_organization = is_organization;
        this.name = name;
        this.revision_id = revision_id;
        this.revision_timestamp = revision_timestamp;
        this.state = state;
        Title = title;
        this.type = type;
    }

    public String getApproval_status() {
        return approval_status;
    }

    public void setApproval_status(String approval_status) {
        this.approval_status = approval_status;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public Boolean getIs_organization() {
        return is_organization;
    }

    public void setIs_organization(Boolean is_organization) {
        this.is_organization = is_organization;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRevision_id() {
        return revision_id;
    }

    public void setRevision_id(String revision_id) {
        this.revision_id = revision_id;
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

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
