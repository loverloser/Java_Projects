package tasksVtb.t2;

public class Main {
    public static void main(String[] args) {
        Contest[] alive = {new Human("Human", "Chester"), new Cat("Cat", "Jackie"),
                new Robot("Robot", "R2D2")};
        Let[] obstacles = {new Wall(1), new RunRoad(1)};

        for (Let let : obstacles) {
            for (Contest contest : alive) {
                if(let instanceof RunRoad){
                    contest.run(let);
                }
                if(let instanceof Wall){
                    contest.jump(let);
                }
                if (!contest.run(let) || !contest.jump(let)) break;
            }

        }
    }

}