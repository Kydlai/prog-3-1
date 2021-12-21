public class DefaultObject extends ProjectObject {
    public DefaultObject(String name){
        this.name = name;
    }

    public DefaultObject(String name, DefaultPerson owner){
        this.name = name;
        this.setOwner(owner);
    }
}
