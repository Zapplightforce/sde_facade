package app;

public class Main {

    public static void main(String[] args) {


        System.out.println("--------Turn on Entertainment System---------");
        System.out.println(EntertainmentSystem.useSystem(Step.TurnOnMovie));
        System.out.println(EntertainmentSystem.useSystem(Step.TurnOffMovie));
        System.out.println(EntertainmentSystem.useSystem(Step.TurnOnMusic));
        System.out.println(EntertainmentSystem.useSystem(Step.TurnOffMusic));
        System.out.println(EntertainmentSystem.useSystem(Step.TurnOnRadio));
        System.out.println(EntertainmentSystem.useSystem(Step.TurnOffRadio));
        System.out.println("--------Turn off Entertainment System---------");
        

    }
}
