package cn.lxgandlz.repository.s;

import cn.lxgandlz.entity.s.Collect;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by 李新广
 *
 * 2017/2/25 18:24
 *
 * http://lxgandlz.cn
 */
@Repository
public interface CollectRepository extends JpaRepository<Collect, Long> {
}
