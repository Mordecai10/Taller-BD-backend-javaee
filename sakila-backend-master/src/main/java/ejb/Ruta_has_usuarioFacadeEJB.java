package ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import facade.AbstractFacade;
import facade.Ruta_has_usuarioFacade;
import model.Ruta;
import model.Usuario;
import model.Ruta_has_usuario;

@Stateless
public class Ruta_has_usuarioFacadeEJB extends AbstractFacade<Ruta_has_usuario> implements Ruta_has_usuarioFacade{

  @PersistenceContext(unitName="mydbPU")
  private EntityManager em;

  public Ruta_has_usuarioFacadeEJB(){
    super(Ruta_has_usuario.class);
  }

  @Override
  protected EntityManager getEntityManager(){
    return this.em;
  }
}
