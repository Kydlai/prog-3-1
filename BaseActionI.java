public interface BaseActionI {
    void doAction(ActionType... actions);
    void doAction(ProjectObject object, ActionType... actions);
    void doPluralAction(String pluralActionType, ProjectObject object, ActionType[] actions_1, ActionType[] actions_2);
}
