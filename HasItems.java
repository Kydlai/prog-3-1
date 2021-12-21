public interface HasItems {
    ProjectObject[] things = null;
    ProjectObject[] getItems();
    public void addItems(ProjectObject... things);
}
