package peaksoft;

import peaksoft.dao.UserDao;
import peaksoft.dao.UserDaoHibernateImpl;
import peaksoft.dao.UserDaoJdbcImpl;
import peaksoft.model.User;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        // реализуйте алгоритм здесь
       //  UserDaoJdbcImpl userDao = new UserDaoJdbcImpl();
        //userDao.createUsersTable();
       // userDao.saveUser("Atabek", "Dosbaev",(byte) 21);
      //  userDao.saveUser("Timur", "Atabekov",(byte) 21);
      // userDao.saveUser("Kuttubek", "Jalalov",(byte) 24);
       // userDao.dropUsersTable();
      // userDao.removeUserById(3);
       // List<User> allUsers = userDao.getAllUsers();
       // System.out.println(allUsers);
        //userDao.cleanUsersTable();


        UserDao userDao = new UserDaoHibernateImpl();

        //userDao.createUsersTable();

        User user = new User("Aidana","Kamchybekova",(byte) 23);
        userDao.saveUser(user.getName(),user.getLastName(),user.getAge());


       User user2 = new User("Atabek","Dosbaev",(byte) 24);
        userDao.saveUser(user2.getName(),user2.getLastName(),user2.getAge());

        User user3 = new User("Meder","Akylbekov",(byte) 21);
        userDao.saveUser(user3.getName(),user3.getLastName(),user3.getAge());


    }
}
