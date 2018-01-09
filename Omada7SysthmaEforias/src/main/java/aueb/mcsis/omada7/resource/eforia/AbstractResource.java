package aueb.mcsis.omada7.resource.eforia;

import javax.persistence.EntityManager;

import aueb.mcsis.omada7.persistence.eforia.JPAUtil;



public class AbstractResource {
	protected EntityManager getEntityManager() {

		return JPAUtil.getCurrentEntityManager();

	}

}
