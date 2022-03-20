package org.baozi.payment.service.test.VO;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.baozi.payment.service.test.DTO.TestDTO;

import java.util.List;

@Data
@AllArgsConstructor
@ApiModel(value = "TestVO", description = "测试VO")
public class TestVO {

    @ApiModelProperty(value = "ceshi")
    private List<TestDTO> testDTOList;

    @ApiModelProperty(value = "数量")
    private Long count;
}
