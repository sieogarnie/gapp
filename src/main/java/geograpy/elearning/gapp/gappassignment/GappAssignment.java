package geograpy.elearning.gapp.gappassignment;

import geograpy.elearning.gapp.gappclass.GappClass;
import geograpy.elearning.gapp.gappmark.GappMark;
import geograpy.elearning.gapp.gapptask.GappTask;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class GappAssignment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne
    private GappTask gappTask;

    private Date dueDate;


    public GappAssignment() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public GappTask getGappTask() {
        return gappTask;
    }

    public void setGappTask(GappTask gappTask) {
        this.gappTask = gappTask;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

}
