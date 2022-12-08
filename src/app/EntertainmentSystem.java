package app;

public class EntertainmentSystem {
    public static String useSystem(Step step){

        Amplifier amp = new Amplifier("Top-O-Line Amplifier");
        Tuner tuner = new Tuner("Top-O-Line AM/FM Tuner", amp);
        DvdPlayer dvd = new DvdPlayer("Top-O-Line DVD Player", amp);
        CdPlayer cd = new CdPlayer("Top-O-Line CD Player", amp);
        Projector projector = new Projector("Top-O-Line Projector", dvd);
        PopcornPopper popper = new PopcornPopper("Popcorn Popper");
        TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
        Screen screen = new Screen("Theater Screen");

        switch (step){
            case TurnOnMovie:
                    popper.on();
                    popper.pop();
                    lights.dim(5);
                    screen.down();
                    projector.on();
                    projector.wideScreenMode();
                    amp.on();
                    amp.setDvd(dvd);
                    amp.setSurroundSound();
                    amp.setVolume(5);
                    dvd.on();
                    dvd.play("IT");

            case TurnOffMovie:
                    popper.off();
                    lights.on();
                    screen.up();
                    projector.off();
                    amp.off();
                    dvd.stop();
                    dvd.eject();
                    dvd.off();

            case TurnOnMusic:
                    lights.on();
                    amp.on();
                    amp.setVolume(5);
                    amp.setCd(cd);
                    amp.setStereoSound();
                    cd.on();
                    cd.play("tribe - bas");

            case TurnOffMusic:
                    amp.off();
                    amp.setCd(cd);
                    cd.eject();
                    cd.off();

            case TurnOnRadio:
                    tuner.on();
                    tuner.setFrequency(420.69);
                    amp.on();
                    amp.setVolume(5);
                    amp.setTuner(tuner);

            case TurnOffRadio:
                    tuner.off();
                    amp.off();

        }
        return null;
    }

}
