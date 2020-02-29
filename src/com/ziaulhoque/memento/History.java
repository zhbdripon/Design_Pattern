// this class called caretaker
package com.ziaulhoque.memento;

import java.util.ArrayList;
import java.util.List;

public class History {
    private List<EditorState> states = new ArrayList<>();


    public void push(EditorState state){
        this.states.add(state);
    }

    public EditorState pop(){
        int lastIndex = this.states.size() - 1;
        EditorState lastState = this.states.get(lastIndex);
        this.states.remove(lastIndex);
        return lastState;
    }


}
