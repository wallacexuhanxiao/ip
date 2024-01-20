/**
 * class for mark an task finish.
 */
public class Mark implements Command{
    private final int oprand;

    /**
     * Constructor
     * change the status of task to finished.
     * @param operand which task to mark from 0
     */
    public Mark(int operand) {
        this.oprand=operand;
        Task.task_list.get(oprand).Done();
    }

    /**
     * Override the reply method in interface
     */
    @Override
    public void reply() {
        System.out.println("    Nice! I've marked this task as done:");
        System.out.printf("    %s\n",Task.task_list.get(oprand));
    }
}
