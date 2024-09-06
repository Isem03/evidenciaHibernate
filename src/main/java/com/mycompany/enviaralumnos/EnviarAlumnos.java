/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.enviaralumnos;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author isadev
 */
public class EnviarAlumnos {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(entidadUsuarios.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {
            session.beginTransaction();

            entidadUsuarios user = new entidadUsuarios();
            
            user.setNombre("david");
            user.setPass(9876);
 

            session.save(user);

            session.getTransaction().commit();

        } finally {
            factory.close();
        }
    }
}
