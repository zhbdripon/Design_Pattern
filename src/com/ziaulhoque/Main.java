package com.ziaulhoque;

import com.ziaulhoque.command.AddCustomerCommand;
import com.ziaulhoque.command.BnWCommand;
import com.ziaulhoque.command.CustomerService;
import com.ziaulhoque.command.ResizeCommand;
import com.ziaulhoque.command.fx.Button;
import com.ziaulhoque.command.fx.Command;
import com.ziaulhoque.command.CompositeCommand;
import com.ziaulhoque.iterator.BrowseHistory;
import com.ziaulhoque.iterator.Iterator;
import com.ziaulhoque.memento.Editor;
import com.ziaulhoque.memento.History;
import com.ziaulhoque.state.Brush;
import com.ziaulhoque.state.Canvas;
import com.ziaulhoque.strategy.*;
import com.ziaulhoque.template.GenerateReportTask;
import com.ziaulhoque.template.Task;
import com.ziaulhoque.template.TransferMoneyTask;

public class Main {

    static void memento(){
        Editor editor = new Editor();
        History history = new History();

        editor.setContent("some text");

        history.push(editor.createState());
        editor.setContent("some other text");

        history.push(editor.createState());
        editor.setContent("and some other text");

        System.out.println(editor.getContent());
        editor.restore(history.pop());
        System.out.println(editor.getContent());
        editor.restore(history.pop());
        System.out.println(editor.getContent());
    }

    static void state(){
        Canvas canvas = new Canvas();
        canvas.setCurrentTool(new Brush());
        canvas.mouseDown();
        canvas.mouseUp();
    }

    static void iterator(){
        BrowseHistory browseHistory = new BrowseHistory();
        browseHistory.push("abc.com");
        browseHistory.push("xyz.com");
        browseHistory.push("asdf.com");
        browseHistory.push("abc.com");


        Iterator iterator = browseHistory.createIterator();

        while (iterator.hasNext()){
            System.out.println(iterator.current());
            iterator.next();
        }
    }

    static void strategy(){
        ImageStorage imageStorage = new ImageStorage();
        imageStorage.store("name1",new JpegCompressor(),new BnWFilter());
        imageStorage.store("name2",new PngCompressor(),new BlurFilter());
    }

    static void template(){
        Task task = new TransferMoneyTask();
        task.execute();
        task = new GenerateReportTask();
        task.execute();
    }

    static void command(){
        CustomerService customerService = new CustomerService();
        Command command = new AddCustomerCommand(customerService);
        Button button = new Button(command);
        button.click();
        //composite command
        CompositeCommand compositeCommand = new CompositeCommand();
        compositeCommand.add(new ResizeCommand());
        compositeCommand.add(new BnWCommand());
        compositeCommand.execute();

    }

    public static void main(String[] args) {
        memento();
        state();
        iterator();
        strategy();
        template();
        command();
    }
}
