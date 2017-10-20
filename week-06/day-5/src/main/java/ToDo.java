public class ToDo {

    int id;
    String toDo;
    boolean checked;

    ToDo(int id, String toDo, boolean checked) {
        this.id = id;
        this.toDo = toDo;
        this.checked = checked;
    }
    @Override
    public String toString() {
        return this.checked + " " + this.id + " " + this.toDo;
    }
}

