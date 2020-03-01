package com.ziaulhoque.command;

import com.ziaulhoque.command.fx.Command;

public class ResizeCommand implements Command {
    @Override
    public void execute() {
        System.out.println("resize");
    }
}
