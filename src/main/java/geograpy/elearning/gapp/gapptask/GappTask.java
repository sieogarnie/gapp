package geograpy.elearning.gapp.gapptask;

import geograpy.elearning.gapp.gappexercise.GappExercise;

import javax.persistence.*;
import java.util.List;

@Entity
public class GappTask {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

    @OneToMany
    List<GappExercise> gappExercise;

    public GappTask() {
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

    public List<GappExercise> getGappExercise() {
        return gappExercise;
    }

    public void setGappExercise(List<GappExercise> gappExercise) {
        this.gappExercise = gappExercise;
    }
}
