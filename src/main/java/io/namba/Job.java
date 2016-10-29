package io.namba;

/**
 * Created by Evan on 23/10/16.
 */
public class Job {
    private final long id;
    private String name;
    private int salary;

    public Job(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
