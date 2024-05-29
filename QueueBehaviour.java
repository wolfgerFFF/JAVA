public interface QueueBehaviour {
    void EnteredTheQueue(String person);
    void ExitTheQueue();
    void NextInLine();
    boolean EmptyQueue();
}
