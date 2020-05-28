package geograpy.elearning.gapp.gappclass;

import geograpy.elearning.gapp.gappassignment.GappAssignment;
import geograpy.elearning.gapp.gappuser.GappUser;

import javax.persistence.*;
import java.util.List;

@Entity
public class GappClass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

    @OneToMany
    private List<GappAssignment> gappAssignments;


    public GappClass() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<GappAssignment> getGappAssignments() {
        return gappAssignments;
    }

    public void setGappAssignments(List<GappAssignment> gappAssignments) {
        this.gappAssignments = gappAssignments;
    }
}
