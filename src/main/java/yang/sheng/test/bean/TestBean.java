package yang.sheng.test.bean;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class TestBean {

    @ApiModelProperty("id")
    private Long id;

    @ApiModelProperty("名称")
    private String testName;
}
