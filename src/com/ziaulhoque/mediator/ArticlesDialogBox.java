package com.ziaulhoque.mediator;

public class ArticlesDialogBox extends DialogBox {
    private  ListBox articleListBox = new ListBox(this);
    private TextBox titleTextBox = new TextBox(this);
    private Button saveButton = new Button(this);

    public void simulateUserInteraction(){
        this.articleListBox.setSelection("Ariticle 1");
        this.titleTextBox.setContent("");
        this.articleListBox.setSelection("Ariticle 2");
        System.out.println("TextBox: "+titleTextBox.getContent());
        System.out.println("Button: "+saveButton.isEnabled());
    }

    @Override
    public void changed(UIControl control) {
        if(control == articleListBox){
            this.articleSelected();
        }else if(control == titleTextBox){
            this.titleChanged();
        }
    }



     private void articleSelected(){
        this.titleTextBox.setContent(articleListBox.getSelection());
        this.saveButton.setEnabled(true);
     }

     private void titleChanged(){
        String content = this.titleTextBox.getContent();
        boolean isEmpty = content == null || content.isEmpty();
        this.saveButton.setEnabled(!isEmpty);
     }
}
