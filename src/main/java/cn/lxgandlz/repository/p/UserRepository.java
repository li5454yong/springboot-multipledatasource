package cn.lxgandlz.repository.p;

import cn.lxgandlz.entity.p.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by 李新广
 *
 * 2017/2/25 18:23
 *
 * http://lxgandlz.cn
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
