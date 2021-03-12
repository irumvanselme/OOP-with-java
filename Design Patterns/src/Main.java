import memento.Editor;

public class Main {
    public static void main(String[] args){
        var editor = new Editor();
        editor.setContent("a");
        editor.setContent("b");
        editor.setContent("c");
        editor.undo();
        editor.undo();

        System.out.println(editor.getContent());
    }
}
