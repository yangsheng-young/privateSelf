package yang.sheng.test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yang.sheng.test.bean.TestBean;
import yang.sheng.test.mapper.TestMapper;
import yang.sheng.test.service.TestService;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper testMapper;

    @Override
    public void insert(TestBean testBean) {
        Long id = testMapper.selectMaxId();
        testBean.setId(id + 1);
        testMapper.insert(testBean);
    }

    @Override
    public List<TestBean> selectAll() {
        return testMapper.selectAll();
    }

    @Override
    public List<TestBean> select(TestBean testBean) {
        return testMapper.select(testBean);
    }

    @Override
    public void updateById(TestBean testBean) {
        if (testBean.getId() == null) {
            return;
        }
        testMapper.updateById(testBean);
    }

    @Override
    public void deleteById(Long id) {
        if (id == null) {
            return;
        }
        testMapper.deleteById(id);
    }


}
