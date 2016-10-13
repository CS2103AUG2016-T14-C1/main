package seedu.todoList.logic;

import javafx.collections.ObservableList;
import seedu.todoList.logic.commands.CommandResult;
import seedu.todoList.model.task.ReadOnlyTask;

/**
 * API of the Logic component
 */
public interface Logic {
    /**
     * Executes the command and returns the result.
     * @param commandText The command as entered by the user.
     * @return the result of the command execution.
     */
    CommandResult execute(String commandText);

    /** Returns the filtered list of todos */
    ObservableList<ReadOnlyTask> getFilteredTodoList();
    /** Returns the filtered list of events */
    ObservableList<ReadOnlyTask> getFilteredEventList();
    /** Returns the filtered list of deadlines */
    ObservableList<ReadOnlyTask> getFilteredDeadlineList();
}