package geograpy.elearning.gapp.gappmark;

import geograpy.elearning.gapp.gappassignment.GappAssignment;
import geograpy.elearning.gapp.gappuser.GappUser;

import javax.persistence.*;

@Entity
public class GappMark {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private short markValue;
    private boolean isPassFail;
    @ManyToOne
    private GappAssignment gappAssignment;

    @OneToOne
    private GappUser gappUser;

    public GappMark() {
    }

    public short getMarkValue() {
        return markValue;
    }

    public void setMarkValue(short markValue) {
        this.markValue = markValue;
    }

    public GappAssignment getGappAssignment() {
        return gappAssignment;
    }

    public void setGappAssignment(GappAssignment gappAssignment) {
        this.gappAssignment = gappAssignment;
    }

    public GappUser getGappUser() {
        return gappUser;
    }

    public void setGappUser(GappUser gappUser) {
        this.gappUser = gappUser;
    }

    public boolean isPassFail() {
        return isPassFail;
    }

    public void setPassFail(boolean passFail) {
        isPassFail = passFail;
    }
}
