package ru.job4j.tracker;

public class Exit implements UserAction {
    private final Output out;

    public Exit(Output output) {
        this.out = output;
    }

    @Override
    public String name() {
        return "Exit";
    }

    @Override
    public boolean execute(Input input, Store tracker) {
        return false;
    }
}
