package evk.itmo.fprj.dto;

import java.text.DateFormat;

public class Player {


    private Integer id;
    private String name;
    private String surname;



    public Player(Integer id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;


    }

    public Player(Integer id) {
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


}
