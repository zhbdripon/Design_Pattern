// this class called originator
package com.ziaulhoque.memento;

public class Editor {
    private String content;

    public EditorState createState(){
        return new EditorState(content);
    }

    public void restore(EditorState editorState){
        this.content = editorState.getContent();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
