package characters;
public class FatOgre extends BadOgre {

    public FatOgre(int energy){
        super(energy);
        this.roar();
    }
    void eat(Knight knight) {

        knight.setEnergy(0);
    }
    public void roar(){
        System.out.println("ROAR");
    }
}
