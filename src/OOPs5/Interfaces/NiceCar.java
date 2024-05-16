package OOPs5.Interfaces;

public class NiceCar {
    //this car has feature called engine
    // it also has MusicPlayer
    private Engine engine;

    //as we have only class CDplayer that implements and override  Media methods so, we can create its obj directly
    private Media player = new CDplayer();

    //by this constructor we can provide engine details when initialising the obj
    public NiceCar(Engine engine) {
            this.engine = engine;
        }

    public NiceCar() {
        engine = new PowerEngine();
    }

    // now that we can create engine according tp our own choice
    // we can add a start method that will call the specified Engine
    public void start() {
        engine.start();
    }
    public void stop(){
        engine.stop();
    }
    public void mediaPlayerStart(){
        player.start();
    }
    public void mediaPlayerStop(){
        player.stop();
    }
    // we can also change engine by creating a fun that Engine as input and assign that value to the engine
    public void changeEngine(){
        this.engine = new ElectricEngine();
    }
    public void changeEngine(Engine engine){
        this.engine = engine;
    }

}
