package cn.lxgandlz.entity.p;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by 李新广
 *
 * 2017/2/25 18:08
 *
 * http://lxgandlz.cn
 */
@Entity
@Table(name = "user")
public class User {
    private Integer id;

    private String password;

    private String username;

    User(){

    }
    public User(String password, String username){
        this.password = password;
        this.username = username;
    }
    @Id
    @GeneratedValue
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
