package evk.itmo.fprj.db.entity;


import javax.persistence.*;
import java.util.List;

@Entity
@Table (schema = "public", name = "player")
public class PlayerEntity {

    @Id
    private Integer id;
    private String name;
    private String surname;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "player_id")
    private List<TeamEntity>teamEntityList;


    public PlayerEntity() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<TeamEntity> getTeamEntityList() {
        return teamEntityList;
    }

    public void setTeamEntityList(List<TeamEntity> teamEntityList) {
        this.teamEntityList = teamEntityList;
    }

    @Override
    public String toString() {
        return "PlayerEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
