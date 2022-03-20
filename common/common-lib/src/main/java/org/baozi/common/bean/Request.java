package org.baozi.common.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "公共请求体")
public class Request<T> {

    @ApiModelProperty(name = "请求接口版本")
    private String version;

    @ApiModelProperty(name = "请求数据")
    private T requestData;

}
