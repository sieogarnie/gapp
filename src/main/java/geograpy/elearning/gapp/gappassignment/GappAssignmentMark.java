package geograpy.elearning.gapp.gappassignment;

import java.util.Date;

public class GappAssignmentMark {

    private long id;
    private String taskName;
    private Date dueDate;
    private short markValue;
    private boolean isPassFail;

    public GappAssignmentMark() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public short getMarkValue() {
        return markValue;
    }

    public void setMarkValue(short markValue) {
        this.markValue = markValue;
    }

    public boolean isPassFail() {
        return isPassFail;
    }

    public void setPassFail(boolean passFail) {
        isPassFail = passFail;
    }
}
