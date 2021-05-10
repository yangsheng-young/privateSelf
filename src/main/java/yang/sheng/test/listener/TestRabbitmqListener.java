package yang.sheng.test.listener;

import com.alibaba.fastjson.JSONObject;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import yang.sheng.test.bean.TestBean;
import yang.sheng.test.service.TestService;

@Component
public class TestRabbitmqListener {

    @Autowired
    private TestService testService;

    /**
     * 消费者
     * @param testJson
     */
    @RabbitListener(queues = "test_queue")
    public void insertListener(String testJson) {
        TestBean testBean = JSONObject.parseObject(testJson, TestBean.class);
        System.out.println(testJson);
        System.out.println(testBean);
        testService.insert(testBean);
    }
}
