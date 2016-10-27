package seedu.todoList.testutil;

//import seedu.todoList.model.tag.UniqueTagList;
import seedu.todoList.model.task.*;
import seedu.todoList.model.task.attributes.*;

/**
 * A mutable task object. For testing only.
 */
//@@author A0132157M
public class TestTask extends Todo implements ReadOnlyTask {

    //private Name name;
    private Todo Todo;
    private static Name name;
    private static Priority priority;
    private static StartDate startDate;
    private static EndDate endDate;
    private static String done;


    public TestTask() {
        super(name, startDate, endDate, priority, done);
    }

    public void setTodo(Todo Todo) {
        this.Todo = Todo;
    }

    public void setName(Name name) {
        TestTask.name = name;
    }

    public void setPriority(Priority priority) {
        TestTask.priority = priority;
    }
    
    public void setStartDate(StartDate sdate) {
        TestTask.startDate = sdate;
    }
    public void setEndDate(EndDate edate) {
        TestTask.endDate = edate;
    }
    public void setDone(String done) {
        TestTask.done = done;
    }

    //@Override
    public Todo getTodo() {
        return Todo;
    }
    
    //@Override
    public Priority getPriority() {
        return priority;
    }

    @Override
    public Name getName() {
        return name;
    }

    public StartDate getStartDate() {
        return startDate;
    }
    public EndDate getEndDate() {
        return endDate;
    }
    public String getDone() {
        return done;
    }

    public String getAddCommand() {
        StringBuilder sb = new StringBuilder();
        sb.append("add " + this.getName().name + " ");
        //sb.append(this.getName().name + " ");
        sb.append("from/ " + this.getStartDate().date + " ");
        sb.append("to/ " + this.getEndDate().endDate + " ");
        sb.append("p/ " + this.getPriority().priority + " ");
        sb.append(this.getDone());
        //this.getTags().getInternalList().stream().forEach(s -> sb.append("t/" + s.tagName + " "));
        return sb.toString();
    }

}
