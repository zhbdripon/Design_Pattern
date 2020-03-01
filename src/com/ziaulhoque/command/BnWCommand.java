package com.ziaulhoque.command;

import com.ziaulhoque.command.fx.Command;

public class BnWCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Black and White filter");
    }
}
