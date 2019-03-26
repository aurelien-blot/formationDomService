package fr.castruche.formationDomService.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Session {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

   // @OneToMany
  //  private List<Candidat> candidatList;

    private Date dateStart;
    private Date dateEnd;

   // @OneToOne
    //private Examinateur examinateur;

    public Session(){
        super();

    }

    public Session(String name){
        this();
        this.name = name;
    }
    //region getter/setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Date getDateStart() {
        return dateStart;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    public Date getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }


    //endregion
}
