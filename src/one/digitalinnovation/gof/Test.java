package one.digitalinnovation.gof;

import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.singleton.*;
import one.digitalinnovation.gof.strategy.ComportamentoNormal;
import one.digitalinnovation.gof.strategy.Robo;
import one.digitalinnovation.gof.strategy.Comportamento;
import one.digitalinnovation.gof.strategy.ComportamentoAgressivo;
import one.digitalinnovation.gof.strategy.ComportamentoDefensivo;

public class Test {

	public static void main(String[] args) {
		// singleton
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println	(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println	(eager);
		
		SingletonLazyHolder holder = SingletonLazyHolder.getInstacia();
		System.out.println(holder);
		holder = SingletonLazyHolder.getInstacia();
		System.out.println	(holder);
		
		// strategy
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		
		robo.setComportamento(normal);
		
		robo.mover();
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();
		
		
		// facade
		
		Facade facade = new Facade();
		facade.migrarCliente("Venilton", "45604535");
		
	}
	
}



