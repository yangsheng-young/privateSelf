package yang.sheng.test.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import yang.sheng.test.bean.TestBean;

import java.util.List;

@Mapper
public interface TestMapper {

    void insert(TestBean testBean);

    List<TestBean> selectAll();

    List<TestBean> select(TestBean testBean);

    Long selectMaxId();

    void updateById(TestBean testBean);

    void deleteById(@Param("id") Long id);
}
