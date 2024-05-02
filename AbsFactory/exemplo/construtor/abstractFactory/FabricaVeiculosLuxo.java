package exemplo.construtor.abstractFactory;

import exemplo.construtor.abstractFactory.luxo.CarroLuxo;
import exemplo.construtor.abstractFactory.luxo.MotoLuxo;

public class FabricaVeiculosLuxo implements FabricaVeiculos {

    @Override
    public Carro criarCarro() {
        return new CarroLuxo();
    }

    @Override
    public Moto criarMoto() {
        return new MotoLuxo();
    }
    
}
