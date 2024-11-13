import java.sql.*;

import java.sql.PreparedStatement;

public class DAOimpl implements UserDAO{

    private static final String url="jdbc:mysql://localhost:3306/:database1";

    private static final String userval="root";
    private static final String pwd="welcome";
    @Override
    public void addUser(User user) {
   String query= "Insert into user(id,username,pwd,email) values(?,?,?)";
   try{
       Connection con= DriverManager.getConnection(url,userval,pwd);
       PreparedStatement pre=con.prepareStatement(query);
       pre.setInt(1,user.getId());
       pre.setString(2,user.getUsername());
       pre.setString(3,user.getPassword());
       pre.setString(4,user.getEmail());
       pre.executeUpdate();

   }
   catch(SQLException e)
              { System.out.println("cannot be added");}
    }

    @Override
    public void removeUser(int id) {
        String query= "delete from user where id=?";
        try{
        Connection con= DriverManager.getConnection(url,userval,pwd);
        PreparedStatement pre=con.prepareStatement(query);
        pre.setInt(1,user.getId());
            pre.executeQuery();
        }
        catch(SQLException e)
        { System.out.println("cannot deleted");}
        
    }

    @Override
    public User getUserById(int id) {
        String query= "select *from user where id=?";
        try{
            Connection con= DriverManager.getConnection(url,userval,pwd);
            PreparedStatement pre=con.prepareStatement(query);
            pre.setInt(1,user.getId());
            ResultSet re=pre.executeQuery();
            if(re.next())
            { return new User(
                    re.getInt(1),
                    re.getString(2),
                    re.getString(3),
                    re.getString(4));
            }

        }
        catch(SQLException e)
        { System.out.println("cannot be fetched");}

    }

    @Override
    public void UpdateUser(User user) {

    }
}
