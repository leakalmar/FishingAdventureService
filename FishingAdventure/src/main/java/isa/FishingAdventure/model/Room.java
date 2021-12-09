package isa.FishingAdventure.model;

import javax.persistence.*;

@Entity
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer roomId;

    @Column(name = "bedNumber", nullable = false)
    private int bedNumber;

    public Room(Integer roomId, int bedNumber) {
        this.roomId = roomId;
        this.bedNumber = bedNumber;
    }

    public Room() {
    }

    public Integer getRoomId() {
        return this.roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public int getBedNumber() {
        return this.bedNumber;
    }

    public void setBedNumber(int bedNumber) {
        this.bedNumber = bedNumber;
    }
}