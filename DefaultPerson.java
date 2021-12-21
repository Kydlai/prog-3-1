public class DefaultPerson extends ProjectObject implements BaseActionI, HasItems {
    public DefaultPerson(String name){
        this.name = name;
    }

    @Override
    public void doAction(ActionType... actions){
        String action_string = name;
        if(actions.length == 1)
            System.out.print(name + " " + actions[0] + " ");
        else{
        for(int i = 0; i < actions.length; ++i)
        {
            action_string = action_string + " " + actions[i].toString();
        }
        System.out.println(action_string + ".");
        }
    }

    @Override
    public void doAction(ProjectObject object, ActionType... actions) {
        String action_string = name;
        for (int i = 0; i < actions.length; ++i) {
            action_string = action_string + " " + actions[i].toString();
        }
        if (object.getOwner() != null && (object.getOwner()).equals(this))
            action_string = action_string + " свои";

        action_string = action_string + " " + object.toString();
        System.out.println(action_string + ".");
    }

    @Override
    public void doPluralAction(String pluralActionType, ProjectObject object, ActionType[] actions_1, ActionType[] actions_2) {
        String action_string = name;
        for(int i = 0; i < actions_1.length; ++i)
            action_string = action_string + " " + actions_1[i].toString();
        action_string = action_string + ", " + pluralActionType;
        for(int i = 0; i < actions_2.length; ++i)
            action_string = action_string + " " + actions_2[i].toString();
        action_string = action_string + " " + object.toString() + (object.getOwner()!=null ? " " + object.getOwner().toString() : "");
        System.out.println(action_string + ".");
    }

    ProjectObject[] things = null;
    public ProjectObject[] getItems(){
        return things;
    }
    public void addItems(ProjectObject[] things){
        for (int i = 0; i < things.length; ++i)
            things[i].setOwner(this);
        if(this.things == null)
            this.things = things;
        else {
            ProjectObject[] things_ram = this.things;
            this.things = new ProjectObject[things.length + things_ram.length];
            for(int i = 0; i < things.length; ++i) {
                if (i < things_ram.length)
                    this.things[i] = things_ram[i];
                else
                    this.things[i] = things[i - things_ram.length];
            }
        }
    }
}
