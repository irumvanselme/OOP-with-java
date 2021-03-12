package memento;

public class Editor {
    private String content;
    private final History history = new History();

    private EditorState createState(){
        return new EditorState(this.content);
    }

    private void restore(EditorState state){
        content = state.getContent();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        history.push(this.createState());
    }

    public void undo(){
        this.restore(history.pop());
    }
}
