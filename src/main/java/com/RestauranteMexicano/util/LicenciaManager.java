package com.RestauranteMexicano.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.RestauranteMexicano.JavaMappers.ClienteMapper;

public class LicenciaManager {
    private String Licencia;
    private SqlSessionFactory session;
    public LicenciaManager(String Licencia){
        this.Licencia = Licencia;
        this.session = getSqlSessionFactory();
    }

    public static SqlSessionFactory getSqlSessionFactory() {
            SqlSessionFactory sqlSessionFactory = null;
            if (sqlSessionFactory == null) {
                InputStream inputStream;
                try {
                    inputStream = Resources.getResourceAsStream("mybatis-config.xml");
                    sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
                } catch (IOException e) {
                    throw new RuntimeException(e.getCause());
                }
            }
            return sqlSessionFactory;
        }
    
    public boolean ValidaLicencia(){
        SqlSession sqlss = this.session.openSession();
        ClienteMapper cm = sqlss.getMapper(ClienteMapper.class);
        Boolean LicenciaValida = cm.validaLicencia(this.Licencia);
        return LicenciaValida;
    }


}
