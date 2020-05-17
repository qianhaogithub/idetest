package com.example.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author qianhao
 * @create 2020/5/4-23:50
 */
public class JpaUtils {

    private static EntityManagerFactory managerFactory = null;

    static {
        managerFactory = Persistence.createEntityManagerFactory("myJpa");
    }

    /**
     * 获取EntityManagy实例类对象
     */

    public static EntityManager getEntityManager(){
        return managerFactory.createEntityManager();
    }
}
