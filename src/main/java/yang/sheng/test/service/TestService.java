package yang.sheng.test.service;

import yang.sheng.test.bean.TestBean;

import java.util.List;

public interface TestService {

    void insert(TestBean testBean);

    List<TestBean> selectAll();

    List<TestBean> select(TestBean testBean);

    void updateById(TestBean testBean);

    void deleteById(Long id);
}
