package br.com.sistemadecadastro.dao.impl;

import br.com.sistemadecadastro.dao.AbstractDao;
import br.com.sistemadecadastro.dao.CargoDao;
import br.com.sistemadecadastro.domain.Cargo;
import org.springframework.stereotype.Repository;



@Repository
public class CargoDaoImpl extends AbstractDao<Cargo, Long> implements CargoDao {

}
