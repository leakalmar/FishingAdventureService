package isa.FishingAdventure.model;

import javax.persistence.*;

@Entity
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "path", nullable = false)
    private String path;

    @Column(name = "is_cover_image", nullable = false)
    private boolean isCoverImage;

    public Image(Integer id, String path, boolean isCoverImage) {
        this.id = id;
        this.path = path;
        this.isCoverImage = isCoverImage;
    }

    public Image() {
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPath() {
        return this.path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public boolean isCoverImage() {
        return isCoverImage;
    }

    public void setCoverImage(boolean coverImage) {
        isCoverImage = coverImage;
    }
}