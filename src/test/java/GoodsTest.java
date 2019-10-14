import java.io.File;
import java.util.Iterator;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zhaozekun.senior2.week2.domain.Goods;
import com.zzk.common.utils.StreamUtil;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring-beans.xml")
public class GoodsTest {
	
	@Resource
	RedisTemplate redisTemplate;
	
	@Test
	public void Goods1() {
		/**
		 * 获取文件的位置
		 */
		File file = new File("src/test/resources/dudu.txt");
		/**
		 * 读取文件的内容
		 */
		String readTextFile = StreamUtil.readTextFile(file);
		/**
		 * 用字符串切割的方式来切割
		 */
			String[] split = readTextFile.split("==");
			/**
			 * 便利这个数组
			 */
			for (String string : split) {
				Goods gs = new Goods();
				Integer id = gs.getId();
				/**
				 * 把读取的数值存入到redis中
				 */
				System.out.println(string);
				redisTemplate.opsForList().leftPush("test", gs);
			}
	}
	
}
