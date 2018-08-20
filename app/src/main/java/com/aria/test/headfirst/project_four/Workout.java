package com.aria.test.headfirst.project_four;

public class Workout {
    private String name;
    private String desc;
    public  static final Workout[] workout = {
            new Workout("aaa","aaa\nhhhhh\naaa"),
            new Workout("bbb","bbb\nhhhhh\naaa"),
            new Workout("ccc","ccc\nhhhhh\naaa"),
            new Workout("ddd","ddd\nhhhhh\naaa")
    };

    public Workout(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }
}
