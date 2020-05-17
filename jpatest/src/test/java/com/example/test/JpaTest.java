package com.example.test;

import com.example.bean.Customer;
import com.example.utils.JpaUtils;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

/**
 * @author qianhao
 * @create 2020/5/4-23:10
 */
public class JpaTest {

    public void before() {

    }

    /**
     * JPA操作步骤
     * 1:加载配置文件创建工厂
     * 2:通过实体管理器工厂获取实体管理器
     * 3:获取事务对象,开启事务
     * 4:完成CRUD操作
     * 5:提交事务
     * 6:释放资源
     */
    @Test
    public void testSave() {
        //myJpa: 根据配置文件配置的 持久化单元的名称
        EntityManager entityManager = JpaUtils.getEntityManager();
        EntityTransaction tx = entityManager.getTransaction();//事务对象
        tx.begin();
        Customer customer = new Customer();
        customer.setCustName("TTTTT");
        customer.setCustAddress("深圳");
        customer.setCustPhone("15827436471");
        customer.setCustLevel("1");
        entityManager.persist(customer);

        tx.commit();

        entityManager.close();
    }

    @Test
    public void testFindOFJpa() {
        EntityManager em = JpaUtils.getEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        Customer customer = em.find(Customer.class, 1L);
        System.out.println(customer);

        tx.commit();
        em.close();

    }

    @Test
    public void testReserfence() {
        EntityManager em = JpaUtils.getEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        Customer customer = em.getReference(Customer.class, 1L);
        System.out.println(customer);

        tx.commit();
        em.close();
    }

    @Test
    public void testDelete() {
        EntityManager em = JpaUtils.getEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        Customer customer = em.getReference(Customer.class, 1L);
        em.remove(customer);
        tx.commit();
        em.close();
    }

    @Test
    public void testUpdate() {
        EntityManager em = JpaUtils.getEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        Customer customer = em.getReference(Customer.class, 1L);
        customer.setCustIndustry("111");
        em.merge(customer);
        tx.commit();
        em.close();
    }

    @Test
    public void testSelectJPQL() {
        EntityManager em = JpaUtils.getEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        Query query = em.createQuery("from com.example.bean.Customer");
        query.setFirstResult(1);
        query.setMaxResults(10);
        List resultList = query.getResultList();
        resultList.forEach((o)->{
            System.out.println(o);
        });
        tx.commit();
        em.close();
    }
}
