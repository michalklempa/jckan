package eu.comsode.libraries.jckan.model;

/**
 * Represents a single resource within a Dataset
 *
 * @author      Ross Jones <ross.jones@okfn.org>
 * @version     2.2
 * @since       2012-05-01
 */
public class Resource {
    public class TrackingSummary {
        private long recent;

        private long total;

        public long getRecent() {
            return recent;
        }

        public void setRecent(long recent) {
            this.recent = recent;
        }

        public long getTotal() {
            return total;
        }

        public void setTotal(long total) {
            this.total = total;
        }
    }

    private String cache_last_updated;

    private String cache_url;

    private String created;

    private String description;

    private String format;

    private String hash;

    private String id;

    private String last_modified;

    private String mimetype;

    private String mimetype_inner;

    private String name;

    private long position;

    private String resource_group_id;

    private String resource_type;

    private String revision_id;

    private long size;

    private String state;

    private TrackingSummary tracking_summary;

    private String url;

    private String url_type;

    private String webstore_last_updated;

    private String webstore_url;

    public Resource() {
    }

    public String getCache_last_updated() {
        return cache_last_updated;
    }

    public void setCache_last_updated(String cache_last_updated) {
        this.cache_last_updated = cache_last_updated;
    }

    public String getCache_url() {
        return cache_url;
    }

    public void setCache_url(String cache_url) {
        this.cache_url = cache_url;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLast_modified() {
        return last_modified;
    }

    public void setLast_modified(String last_modified) {
        this.last_modified = last_modified;
    }

    public String getMimetype() {
        return mimetype;
    }

    public void setMimetype(String mimetype) {
        this.mimetype = mimetype;
    }

    public String getMimetype_inner() {
        return mimetype_inner;
    }

    public void setMimetype_inner(String mimetype_inner) {
        this.mimetype_inner = mimetype_inner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPosition() {
        return position;
    }

    public void setPosition(long position) {
        this.position = position;
    }

    public String getResource_group_id() {
        return resource_group_id;
    }

    public void setResource_group_id(String resource_group_id) {
        this.resource_group_id = resource_group_id;
    }

    public String getResource_type() {
        return resource_type;
    }

    public void setResource_type(String resource_type) {
        this.resource_type = resource_type;
    }

    public String getRevision_id() {
        return revision_id;
    }

    public void setRevision_id(String revision_id) {
        this.revision_id = revision_id;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public TrackingSummary getTracking_summary() {
        return tracking_summary;
    }

    public void setTracking_summary(TrackingSummary tracking_summary) {
        this.tracking_summary = tracking_summary;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl_type() {
        return url_type;
    }

    public void setUrl_type(String url_type) {
        this.url_type = url_type;
    }

    public String getWebstore_last_updated() {
        return webstore_last_updated;
    }

    public void setWebstore_last_updated(String webstore_last_updated) {
        this.webstore_last_updated = webstore_last_updated;
    }

    public String getWebstore_url() {
        return webstore_url;
    }

    public void setWebstore_url(String webstore_url) {
        this.webstore_url = webstore_url;
    }
}
