public class ProjectTest {
    public static void main(String[] args){
        Project noInfo = new Project();
        Project withName = new Project("Project 2");
        Project withAll = new Project("Project 3", "This is the description");
        System.out.println(noInfo.elevatorPitch());
        System.out.println(withName.elevatorPitch());
        System.out.println(withAll.elevatorPitch());
        noInfo.setName("Project 1");
        System.out.println(noInfo.getName());
        withName.setDescription("Project 2 description has been added!");
        System.out.println(withName.elevatorPitch());
        System.out.println(withAll.getDescription());
    }
}