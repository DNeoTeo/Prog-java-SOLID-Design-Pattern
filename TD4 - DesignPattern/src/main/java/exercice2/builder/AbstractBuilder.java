package exercice2.builder;

import exercice2.materiau.IMaterial;
import exercice2.materiau.Wood;

import java.awt.im.spi.InputMethod;

public abstract class AbstractBuilder {
    private IMaterial buildMate= new Wood();
    public void setMaterial(IMaterial mate){
        buildMate = mate;
    }
    public void startBuilding(){
        buildMate.useMaterial();
    }
}
