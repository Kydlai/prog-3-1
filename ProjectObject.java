public abstract class ProjectObject implements HasOwner{
    String name;
    public String getName() {
        return name;
    }
    DefaultPerson owner;

    public void setOwner(DefaultPerson owner){
        this.owner = owner;
    }

    public String toString() {
        return this.getName();
    }

    public boolean equals(ProjectObject object) {
        return object.hashCode() == this.hashCode() && object.toString().equals(this.toString());
    }

    public int hashCode() {
        if(name == null)
            return 0;
        int code = 0;
        for(int i = 0; i < name.length(); ++i)
        {
            code += name.charAt(i);
            code %= 10000;
        }
        return code;
    }
}
