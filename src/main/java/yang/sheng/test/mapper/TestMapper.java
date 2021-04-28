package yang.sheng.test.mapper;

import org.apache.ibatis.annotations.Mapper;
import yang.sheng.test.bean.TestBean;

import java.util.List;

@Mapper
public interface TestMapper {

    void insert(TestBean testBean);

    List<TestBean> selectAll();
}
