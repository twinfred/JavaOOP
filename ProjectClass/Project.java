public class Project {
    private String name;
    private String description;

    public Project(){
        createProject("No name", "No description");
    }
    public Project(String name){
        createProject(name, "No description");
    }
    public Project(String name, String description){
        createProject(name, description);
    }
    private void createProject(String name, String description){
        this.name = name;
        this.description = description;
    }

    public String getName(){
        return this.name;
    }
    public String getDescription(){
        return this.description;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setDescription(String description){
        this.description = description;
    }

    public String elevatorPitch(){
        return this.name + ": " + this.description;
    }
}