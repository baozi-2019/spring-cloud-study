package org.baozi.payment.api.test.VO;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.baozi.payment.api.test.DTO.TestDTO;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "TestVO", description = "测试VO")
public class TestVO implements Serializable {

    private static final long serialVersionUID = 3615429418097755411L;

    @ApiModelProperty(value = "ceshi")
    private List<TestDTO> testDTOList;

    @ApiModelProperty(value = "数量")
    private Long count;
}
