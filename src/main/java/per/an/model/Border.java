package per.an.model;

import javax.persistence.*;

@Entity
@Table(name = "borders")
public class Border {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    private String borderLocalization;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBorderLocalization() {
        return borderLocalization;
    }

    public void setBorderLocalization(String borderLocalization) {
        this.borderLocalization = borderLocalization;
    }
}
