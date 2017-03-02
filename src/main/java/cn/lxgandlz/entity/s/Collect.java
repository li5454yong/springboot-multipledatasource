package cn.lxgandlz.entity.s;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by 李新广
 *
 * 2017/2/25 18:14
 *
 * http://lxgandlz.cn
 */
@Entity
@Table(name = "collect")
public class Collect {
    private Integer id;

    private Integer f_id;

    private Integer u_id;

    private Date init_date;

    private Date upd_data;

    Collect(){

    }
    public Collect(Integer f_id,Integer u_id){
        this.f_id = f_id;
        this.u_id = u_id;
        this.init_date = new Date();
        this.upd_data = new Date();
    }
    @Id
    @GeneratedValue
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getF_id() {
        return f_id;
    }

    public void setF_id(Integer f_id) {
        this.f_id = f_id;
    }

    public Integer getU_id() {
        return u_id;
    }

    public void setU_id(Integer u_id) {
        this.u_id = u_id;
    }

    public Date getInit_date() {
        return init_date;
    }

    public void setInit_date(Date init_date) {
        this.init_date = init_date;
    }

    public Date getUpd_data() {
        return upd_data;
    }

    public void setUpd_data(Date upd_data) {
        this.upd_data = upd_data;
    }
}
