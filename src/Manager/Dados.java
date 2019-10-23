
package Manager;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


abstract public class Dados {
    private static EntityManager entity = null;
    
    public static EntityManager getEntity(){
        if (entity == null){
            EntityManagerFactory factory =  
            Persistence.createEntityManagerFactory("AppMyWaterPU");
            entity = factory.createEntityManager();
        }
        return entity;
    }   
}
