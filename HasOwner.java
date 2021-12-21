public interface HasOwner {
    DefaultPerson owner = null;
    default ProjectObject getOwner(){
        if(owner != null)
            return owner;
        return null;
    }

    void setOwner(DefaultPerson owner);

}
