package com.coderdream.hibernate3.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.coderdream.hibernate3.model.Person;

public class FirstHibernate {

    private static String CONFIG_FILE_LOCATION = "/hibernate.cfg.xml";

    public static void main(String[] args) {
        // Configuration 負責管理 Hibernate配置訊息
        Configuration config = new Configuration()
                .configure(CONFIG_FILE_LOCATION);

        // 根据config建立SessionFactory
        // SessionFactory将用于建立Session
        SessionFactory sessionFactory = config.buildSessionFactory();

        // 将持久化的物件
        Person person = new Person();
        person.setId(1);
        person.setName("neo");
        person.setAge(13);
        // 开启Session，相当于开启JDBC的Connection
        Session session = sessionFactory.openSession();
        // Transaction表示一组对DB的交易
        Transaction tx = session.beginTransaction();

        System.out.println("新增人员成功!");

        // 读取主键（id）为1的人员信息
        Person p = (Person) session.get(Person.class, 2);
        System.out.println(p);
        session.update(person);
        session.flush();
        tx.commit();
        session.close();
        sessionFactory.close();
    }
}