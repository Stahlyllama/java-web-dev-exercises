package exercises.ch7_technology.main;

public abstract class AbstractEntity {
    private int id;  // we have a variable id
    private static int nextId = 1;

    public AbstractEntity(){
        this.id = nextId;  // we set the id here
        nextId++;
       /*"static" means it belongs to the class not the instance.
       If we create a static counter in this class no matter how many instances are created
       we can manipulate that static counter to essentially keep incrementing and remembering
        where it's at in that count to keep assigning ids one after the other, hence making them unique.*/
    }

    //methods
    //and b/c id is private we have to create a getter
    public int getId() {return this.id;}
}
