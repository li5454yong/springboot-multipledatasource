package cn.lxgandlz;

import cn.lxgandlz.entity.p.User;
import cn.lxgandlz.entity.s.Collect;
import cn.lxgandlz.repository.p.UserRepository;
import cn.lxgandlz.repository.s.CollectRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class SpringbootMultipledatasourceApplicationTests {

	@Resource
	private UserRepository userRepository;

	@Resource
	private CollectRepository collectRepository;

	@Test
	public void test() {
		userRepository.save(new User("aaa","aaa"));
		userRepository.save(new User("bbb","bbb"));
		userRepository.save(new User("ccc","ccc"));

		Assert.assertEquals(3,userRepository.findAll().size());

		collectRepository.save(new Collect(1,1));
		collectRepository.save(new Collect(2,2));

		Assert.assertEquals(2,collectRepository.findAll().size());
	}

}
