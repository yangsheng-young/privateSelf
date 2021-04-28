package yang.sheng.test.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import yang.sheng.test.bean.TestBean;
import yang.sheng.test.service.TestService;

import java.util.List;

@Api
@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @ApiOperation("插入数据")
    @PostMapping("/insert")
    public void insert(@RequestBody @ApiParam("数据") TestBean testBean) {
        testService.insert(testBean);
    }

    @ApiOperation("查询所有数据")
    @GetMapping("/selectAll")
    public List<TestBean> selectAll() {
        return testService.selectAll();
    }
}
