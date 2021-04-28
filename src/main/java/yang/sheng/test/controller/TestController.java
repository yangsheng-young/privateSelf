package yang.sheng.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import yang.sheng.test.bean.TestBean;
import yang.sheng.test.service.TestService;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @PostMapping("/insert")
    public void insert(@RequestBody TestBean testBean) {
        testService.insert(testBean);
    }

    @GetMapping("/selectAll")
    public List<TestBean> selectAll() {
        return testService.selectAll();
    }
}
