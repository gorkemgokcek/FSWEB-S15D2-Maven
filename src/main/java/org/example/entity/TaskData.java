package org.example.entity;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TaskData {

    private Set<Task> annsTasks;
    private Set<Task> bobsTasks;
    private Set<Task> carolsTasks;
    private Set<Task> unassignedTasks;



    public TaskData( Set<Task> annsTasks, Set<Task> bobsTasks, Set<Task> carolsTasks, Set<Task> unassignedTasks) {
        this.annsTasks = annsTasks;
        this.bobsTasks = bobsTasks;
        this.carolsTasks = carolsTasks;
        this.unassignedTasks = unassignedTasks;
    }

    public Set<Task> getTasks(String name) {
        return switch (name) {
            case "ann" -> annsTasks;
            case "bob" -> bobsTasks;
            case "carol" -> carolsTasks;
            default -> unassignedTasks;
        };

    }

    public Set<Task> getUnion(Set<Task>... taskSets) {
        Set<Task> union = new HashSet<>();
        for (Set<Task> taskSet : taskSets) {
            union.addAll(taskSet);
        }
        return union;
    }

    public Set<Task> getIntersection(Set<Task>taskSet1, Set<Task> taskSet2) {
        Set<Task> taskSet1Copy = new HashSet<>(taskSet1);

        taskSet1Copy.retainAll(taskSet2);
        return taskSet1Copy;
    }

    public Set<Task> getDifferences(Set<Task>taskSet1, Set<Task> taskSet2) {
        Set<Task> taskSet1Copy = new HashSet<>(taskSet1);
        taskSet1Copy.removeAll(taskSet2);
        return taskSet1Copy;
    }

}
