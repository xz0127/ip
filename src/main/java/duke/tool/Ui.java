package duke.tool;

import duke.task.Deadline;
import duke.task.Event;
import duke.task.TaskList;
import duke.task.Todo;


/**
 * Handles system output.
 */
public class Ui {

    /**
     * Prints welcome message.
     */
    public void printWelcomeMessage() {
        String emoji = Emoji.CHICKEN.toString();
        String welcomeMessage = "    ____________________________________________________________\n"
                + "    Hello! I'm ByteMe " + emoji + emoji + emoji + "\n"
                + "    What can I do for you? (Don't bite me!)\n"
                + "    ____________________________________________________________\n";

        System.out.println(welcomeMessage);
    }

    /**
     * Prints bye message.
     */
    public void sendBye() {
        String msgForBye = "    ____________________________________________________________\n"
                + "    Bye. Hope to see you again soon! \n"
                + "    ____________________________________________________________\n";
        System.out.println(msgForBye);
    }

    /**
     * Outputs the number of tasks.
     * @param i number of tasks.
     */
    public void sendCount(int i) {
        System.out.println("    Now you have " + i + " tasks in the list.");
    }

    /**
     * Prints the newly added to-do item.
     * @param tl a list of tasks.
     * @param todo a to-do item.
     */
    public void printAddedToDo(TaskList tl, Todo todo) {
        String msgForToDo = "    ____________________________________________________________\n"
                + "    Got it. I 've added this task: \n"
                + "      " + todo.toString() + "\n"
                + tl.countNum() + "\n"
                + "    ____________________________________________________________\n";
        System.out.println(msgForToDo);
    }

    /**
     * Prints the newly added deadline item.
     * @param tl a list of tasks.
     * @param ddl a deadline item.
     */
    public void printAddedDdl(TaskList tl, Deadline ddl) {
        String msgForToDo = "    ____________________________________________________________\n"
                + "    Got it. I 've added this task: \n"
                + "      " + ddl.toString() + "\n"
                + tl.countNum() + "\n"
                + "    ____________________________________________________________\n";
        System.out.println(msgForToDo);
    }

    /**
     * Prints the newly added event item.
     * @param tl a list of tasks.
     * @param event a event item.
     */
    public void printAddedEvent(TaskList tl, Event event) {
        String msgForEvent = "    ____________________________________________________________\n"
                + "    Got it. I 've added this task: \n"
                + "      " + event.toString() + "\n"
                + tl.countNum() + "\n"
                + "    ____________________________________________________________\n";
        System.out.println(msgForEvent);
    }

    /**
     * Prints loading error.
     */
    public void showLoadingError() {
        System.out.println("Loading error!");
    }
}
