package exemplo.construtor.abstractFactory;

import exemplo.construtor.abstractFactory.economico.CarroEconomico;
import exemplo.construtor.abstractFactory.economico.MotoEconomico;

public class FabricaVeiculosEconomicos implements FabricaVeiculos {

    @Override
    public Carro criarCarro() {
       return new CarroEconomico();
    }

    @Override
    public Moto criarMoto() {
        return new MotoEconomico();
    }

    
}