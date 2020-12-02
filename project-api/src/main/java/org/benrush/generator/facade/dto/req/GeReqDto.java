package org.benrush.generator.facade.dto.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Data
@ApiModel("Ge请求体")
public class GeReqDto {

    private String v;

    private Integer v1;

    private Object v2;

    private Long v3;

    private BigDecimal v4;

    private Short v5;

    private String v6;


}
