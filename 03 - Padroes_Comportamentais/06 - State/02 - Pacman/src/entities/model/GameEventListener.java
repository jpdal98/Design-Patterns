package entities.model;

@FunctionalInterface
public interface GameEventListener {
    
    void onAction(String option);
}
