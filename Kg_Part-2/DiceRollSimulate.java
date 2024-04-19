public class DiceRollSimulate {
    int roll(){
        double rand=Math.random()*6;
        return (int)Math.ceil(rand);
    }


    public static void main(String[] args) {
        DiceRollSimulate ds=new DiceRollSimulate();
        
        for(int i=0; i<10; i++) //just checking...
        System.out.print(ds.roll()+", ");
    }
}
