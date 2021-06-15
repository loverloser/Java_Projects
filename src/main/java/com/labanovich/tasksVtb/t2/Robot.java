package com.labanovich.tasksVtb.t2;

public class Robot implements Contest{
    private String type;
    private String name;
    private int runLimit;
    private int jumpLimit;

    public Robot(String type, String name) {
        this.type = type;
        this.name = name;
        this.runLimit = 0;
        this.jumpLimit = 10;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRunLimit() {
        return runLimit;
    }

    public void setRunLimit(int runLimit) {
        this.runLimit = runLimit;
    }

    public int getJumpLimit() {
        return jumpLimit;
    }

    public void setJumpLimit(int jumpLimit) {
        this.jumpLimit = jumpLimit;
    }

    @Override
    public boolean run(Let let) {

            if(this.runLimit <= let.getHeight()){
                System.out.println(this.type + " " +  this.name + " не смог совершить забег");
                return false;
            }else{
                System.out.println(this.type + " " +  this.name + " смог совершить забег на " + let.getHeight());
            }
            return true;

    }

    @Override
    public boolean jump(Let let) {

            if (this.jumpLimit <= let.getHeight()) {
                System.out.println(this.type + " " + this.name + " не смог совершить прыжок");
                return false;
            } else {
                System.out.println(this.type + " " + this.name + " смог совершить прыжок на " + let.getHeight());
            }
            return true;
    }
}
