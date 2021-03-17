package dao;

import config.DbConnection;
import models.Department;
import models.Model;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public interface Dao {
    Connection connection = DbConnection.getConnection();
}
