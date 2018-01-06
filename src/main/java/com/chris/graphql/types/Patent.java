package com.chris.graphql.types;

import java.util.List;

/**
 * Created by ye830 on 1/4/2018.
 */
public class Patent {

    private String id;

    private String pn;

    private List<String> ipc;

    private Assignee assignee;

    private List<Inventor> inventor;

    public String getPn() {
        return pn;
    }

    public void setPn(String pn) {
        this.pn = pn;
    }

    public List<String> getIpc() {
        return ipc;
    }

    public void setIpc(List<String> ipc) {
        this.ipc = ipc;
    }

    public Assignee getAssignee() {
        return assignee;
    }

    public void setAssignee(Assignee assignee) {
        this.assignee = assignee;
    }

    public List<Inventor> getInventor() {
        return inventor;
    }

    public void setInventor(List<Inventor> inventor) {
        this.inventor = inventor;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
