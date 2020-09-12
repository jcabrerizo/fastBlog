package es.cabrerizo.fastblog.api.model;

public class EntryDto {

    private Integer id;
    private String title;
    private String body;
    private String creationDte;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getCreationDte() {
        return creationDte;
    }

    public void setCreationDte(String creationDte) {
        this.creationDte = creationDte;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
