package Shields;

public class NuliShield extends Sheld{

    private static NuliShield instance;

    private NuliShield(){
        super(0, 0);
    }

    public static NuliShield getInstance(){
        if (instance == null){
            synchronized (NuliShield.class){
                if (instance == null){
                    instance = new NuliShield();
                }
            }
        }
        return instance;
    }

}




    

