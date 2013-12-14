/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gcom.modules.group;

import java.rmi.Remote;
import java.util.Random;

/**
 *
 * @author praneeth
 */
public class Member implements Remote {

    private String id;
    private int identifier;
    private Group parentGroup;
    private boolean isElectionParticipant = false;
    private boolean isGroupLeader = false;

    public Member(Group parent) {
        this.parentGroup = parent;
        identifier = new Random().nextInt(100) + 1;
    }

    public Member() {
    }

    public void callElection() {

    }

    /**
     * @return the parentGroup
     */
    public Group getParentGroup() {
        return parentGroup;
    }

    /**
     * @param parentGroup the parentGroup to set
     */
    public void setParentGroup(Group parentGroup) {
        this.parentGroup = parentGroup;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the identifier
     */
    public int getIdentifier() {
        return identifier;
    }

    /**
     * @param identifier the identifier to set
     */
    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    public void start() {
    }
}
