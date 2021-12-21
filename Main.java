public class Main {

    public static void main(String[] args){
        DefaultPerson julio = new DefaultPerson("Жулио");
        DefaultPerson main_person = new DefaultPerson("Главный герой");
        ComplexObject train = new ComplexObject("поезд");
        DefaultObject pillow = new DefaultObject("подушку");
        ComplexObject main_person_head = new ComplexObject( "голову");
        DefaultObject julio_head = new DefaultObject("по голове", julio);
        DefaultObject stick = new DefaultObject("трость");
        ComplexObject that = new ComplexObject("это");
        DefaultObject new_stick = new DefaultObject("новая трость");
        DefaultObject money = new DefaultObject("деньги");
        main_person.addItems(new DefaultObject[] { money });
        train.addItems(new DefaultPerson[] { main_person });
        main_person.doAction(train, ActionType.WANT, ActionType.REQUIRE, ActionType.STOP);
        main_person.doAction(stick, ActionType.DECIDE, ActionType.GO, ActionType.FIND);
        main_person.doAction(ActionType.UNDERSTAND);
        that.doAction(new_stick, ActionType.MORETHAN);
        main_person.doAction(ActionType.PUTDOWN);
        main_person_head.doAction(pillow, ActionType.ON);
        main_person.doAction(money, ActionType.UNDERSTAND, ActionType.NEED, ActionType.SPEND);
        main_person.doAction(stick, ActionType.WANT, ActionType.REMEMBER, ActionType.WHERE, ActionType.LOST);
        main_person.doPluralAction("когда", julio_head, new ActionType[] {ActionType.REMEMBERWHAT, ActionType.HAVE, ActionType.HER}, new ActionType[] {ActionType.KICK});
        //System.out.println(julio.hashCode());
        //System.out.println(julio2.hashCode());

    }

}