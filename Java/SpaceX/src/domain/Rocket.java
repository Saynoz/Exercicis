package domain;

public class Rocket {

    private String id;
    private int[] Engine;
    private MerlinEngine[] mEngine;
    
    
    public Rocket(String id, int[] Engine) throws Exception {
        if (id.length() != 8) {
            throw new Exception();
        }
        this.id = id;
        this.Engine = Engine;
        //mEngine = new MerlinEngine();
        //mEngine= new MerlinEngine(1);
        for(int i=0; i<Engine.length; i++){
             
        }
       // this.mEngine[0] = Engine[0];
    }

    public int[] getEngine() {
        return this.Engine;
    }

    public String getId() {
        return id;
    }

  

}
