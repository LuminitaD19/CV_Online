package org.sci.MyProject.CvProject.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
@Entity
@Table(name="employment")
public class Employment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "employment_id")
    private Integer employmentId;

    private String position;
    private String employmentName;
    private Date dataStart;

    private Date dataEnd;
    private String tasks;
    private String toolsUsed;
    public Employment(String position, String employmentName, Date dataStart, Date dataEnd, String tasks, String toolsUsed) {
        this.position = position;
        this.employmentName = employmentName;
        this.dataStart = dataStart;
        this.dataEnd = dataEnd;
        this.tasks = tasks;
        this.toolsUsed = toolsUsed;
    }

    public Employment() {

    }

    public Integer getEmploymentId() {
        return employmentId;
    }

    public void setEmploymentId(Integer employmentId) {
        this.employmentId = employmentId;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmploymentName() {
        return employmentName;
    }

    public void setEmploymentName(String employmentName) {
        this.employmentName = employmentName;
    }

    public Date getDataStart() {
        return dataStart;
    }

    public void setDataStart(Date dataStart) {
        this.dataStart = dataStart;
    }

    public Date getDataEnd() {
        return dataEnd;
    }

    public void setDataEnd(Date dataEnd) {
        this.dataEnd = dataEnd;
    }

    public String getTasks() {
        return tasks;
    }

    public void setTasks(String tasks) {
        this.tasks = tasks;
    }

    public String getToolsUsed() {
        return toolsUsed;
    }

    public void setToolsUsed(String toolsUsed) {
        this.toolsUsed = toolsUsed;
    }
}
