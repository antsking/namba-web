package io.namba;

import java.util.List;

/**
 * Created by Evan on 22/10/16.
 */

public class User {

    private final long id;
    private String email;
    private Job fullTimeJob;
    private Job partTimeJob;
    private List friends;

    public User(long id,String email){
        this.id = id;
        this.email = email;
    }

    public long getId(){
        return id;
    }

    public String getEmail(){
        System.out.println(email);
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Job getFullTimeJob() {
        return fullTimeJob;
    }

    public void setFullTimeJob(Job fullTimeJob) {
        this.fullTimeJob = fullTimeJob;
    }

    public Job getPartTimeJob() {
        return partTimeJob;
    }

    public void setPartTimeJob(Job partTimeJob) {
        this.partTimeJob = partTimeJob;
    }

    public List getFriends() {
        return friends;
    }

    public void setFriends(List friends) {
        this.friends = friends;
    }

    public void init(){
        System.out.println("after initialization");
    }

    public void destroy(){
        System.out.println("before destruction triggered");
    }
}
