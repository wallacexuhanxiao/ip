package duke.command;

import duke.TaskList;
import duke.task.Task;

/**
 * Class for sorting
 */
public class Sort implements Command {
    private TaskList taskList;

    /**
     * Constructor
     * @param taskList task list
     */
    public Sort(TaskList taskList) {
        taskList.sortTaskList();
        this.taskList = taskList;
    }

    /**
     * Reply
     * @return reply
     */
    @Override
    public String reply() {
        String reply = "Your tasks has been sorted:\n";
        int i = 0;
        for (Task task : taskList.getTaskList()) {
            reply += String.format("  %s.%s\n", ++i, task);
        }
        return reply;
    }
}
