package per.an.model;

import javax.persistence.*;

@Entity
@Table(name = "cards")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    private String title;

    @ManyToOne
    private Type type;

    private String imageLocalization;

    @ManyToOne
    private Border imageBorder;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getImageLocalization() {
        return imageLocalization;
    }

    public void setImageLocalization(String imageLocalization) {
        this.imageLocalization = imageLocalization;
    }

    public Border getImageBorder() {
        return imageBorder;
    }

    public void setImageBorder(Border imageBorder) {
        this.imageBorder = imageBorder;
    }
}
