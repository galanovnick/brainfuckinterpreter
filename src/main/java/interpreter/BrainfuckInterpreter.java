package main.java.interpreter;

import java.util.ArrayList;
import java.util.List;

public class BrainfuckInterpreter {
    private byte[] dataArray;
    private int maxDataArraySize;
    private int pointer = 0;
    private boolean errorFlag = false;
    private List<Command> commandList = new ArrayList<>();

    public BrainfuckInterpreter() {
        this.maxDataArraySize = 30000;
        dataArray = new byte[maxDataArraySize];
    }


    private void interpretLine(String input) {

    }

    public void execute() {

    }

    class BrainfuckCommandsFactory implements CommandsFactory {
        @Override
        public Command makeCommandBySymbol(char symbol) {
            return null;
        }

        @Override
        public List<Command> makeCycleByString(String commands) {
            return null;
        }
    }
}
