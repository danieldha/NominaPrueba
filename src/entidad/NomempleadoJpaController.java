/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import entidad.exceptions.NonexistentEntityException;
import entidad.exceptions.PreexistingEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author danielha
 */
public class NomempleadoJpaController implements Serializable {

    public NomempleadoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Nomempleado nomempleado) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(nomempleado);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findNomempleado(nomempleado.getId()) != null) {
                throw new PreexistingEntityException("Nomempleado " + nomempleado + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Nomempleado nomempleado) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            nomempleado = em.merge(nomempleado);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = nomempleado.getId();
                if (findNomempleado(id) == null) {
                    throw new NonexistentEntityException("The nomempleado with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(String id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Nomempleado nomempleado;
            try {
                nomempleado = em.getReference(Nomempleado.class, id);
                nomempleado.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The nomempleado with id " + id + " no longer exists.", enfe);
            }
            em.remove(nomempleado);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Nomempleado> findNomempleadoEntities() {
        return findNomempleadoEntities(true, -1, -1);
    }

    public List<Nomempleado> findNomempleadoEntities(int maxResults, int firstResult) {
        return findNomempleadoEntities(false, maxResults, firstResult);
    }

    private List<Nomempleado> findNomempleadoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Nomempleado.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Nomempleado findNomempleado(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Nomempleado.class, id);
        } finally {
            em.close();
        }
    }

    public int getNomempleadoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Nomempleado> rt = cq.from(Nomempleado.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

    public List<Nomempleado> findNomempleadoAll() {
       EntityManager em = getEntityManager();
        List<Nomempleado> results = null; 
        try {
          TypedQuery<Nomempleado> query=em.createNamedQuery("Nomempleado.findAll", Nomempleado.class);
            
            System.out.println(query.getResultList().get(0).getNombre());
           return query.getResultList();
          
            
          //return results;
        } finally {
            em.close();
        }
    }
    
}
