package yang.sheng.test.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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

    @ApiOperation("查询数据")
    @PostMapping("/select")
    public List<TestBean> select(@RequestBody @ApiParam("查询条件") TestBean testBean) {
        return testService.select(testBean);
    }

    @ApiOperation("根据id更新")
    @PutMapping("/updateById")
    public void updateById(@RequestBody @ApiParam("修改数据") TestBean testBean) {
        testService.updateById(testBean);
    }

    @ApiOperation("根据id删除")
    @DeleteMapping("/deleteById")
    public void deleteById(@RequestParam @ApiParam("删除id") Long id) {
        testService.deleteById(id);
    }
}
