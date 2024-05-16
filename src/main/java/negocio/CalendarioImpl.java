package negocio;

import java.util.List;


import modelo.Ingrediente;
import persistencia.IngredienteDao;

public class CalendarioImpl implements Calendario{

	private IngredienteDao iDao;
	
	@Override
	public List<Ingrediente> getIngredientes() {
		return iDao.findAll();
	}

}
