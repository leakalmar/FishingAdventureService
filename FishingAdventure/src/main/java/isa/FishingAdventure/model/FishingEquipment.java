package isa.FishingAdventure.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class FishingEquipment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @ManyToMany(mappedBy = "fishingEquipment")
    private Set<Boat> boats = new HashSet<Boat>();


    public FishingEquipment(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public FishingEquipment() {
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Boat> getBoats() {
        return boats;
    }

    public void setBoats(Set<Boat> boats) {
        this.boats = boats;
    }
}