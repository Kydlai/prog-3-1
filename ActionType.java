public enum ActionType {
    STOP("остановить"),
    DECIDE("решил"),
    GO("ехать"),
    FIND("искать"),
    ON("на"),
    UNDERSTAND("понял, что"),
    REMEMBER("вспомнить"),
    REMEMBERWHAT("вспомнил, что"),
    HER("её"),
    LOST("потерял"),
    HAVE("держал"),
    REQUIRE("потребовать"),
    KICK("ударил"),
    WANT("хотел"),
    WHERE("где"),
    SPEND("тратить"),
    MORETHAN("дороже, чем"),
    PUTDOWN("положил"),
    NEED("придется");

    private final String name;

    ActionType(String name) {
        this.name = name;
    }

    public String toString(){
        return name;
    }

}
