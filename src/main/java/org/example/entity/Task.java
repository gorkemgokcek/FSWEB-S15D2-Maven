package org.example.entity;

public class Task implements Comparable<Task> {
    private String project;
    private String description;
    private String assignee;
    private Priority priority;
    private Status status;

    public Task(String project, String description, String assignee, Status status, Priority priority) {
        this.project = project;
        this.description = description;
        this.assignee = assignee;
        this.priority = priority;
        this.status = status;
    }

    public String getProject() {
        return project;
    }

    public String getDescription() {
        return description;
    }


    public String getAssignee() {
        return assignee;
    }


    public Priority getPriority() {
        return priority;
    }


    public Status getStatus() {
        return status;
    }

    @Override
    public int compareTo(Task other) {
        return this.description.compareTo(other.description) + this.project.compareTo(other.project);
    }
}


