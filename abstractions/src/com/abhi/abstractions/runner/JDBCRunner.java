package com.abhi.abstractions.runner;

import com.abhi.abstractions.internal.JDBC;
import com.abhi.abstractions.internal.MysqlJDBC;
import com.abhi.abstractions.internal.OracleJDBC;

public class JDBCRunner {
    public static void main(String[] args) {
        JDBC jdbc=new OracleJDBC();
        JDBC jdbc1=new MysqlJDBC();
        Application application=new Application(jdbc);
        application.teaminfo();
        Application application1=new Application(jdbc1);
        application1.teaminfo();
    }
}
