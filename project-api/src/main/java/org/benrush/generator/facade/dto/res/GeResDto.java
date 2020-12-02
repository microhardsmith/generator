package org.benrush.generator.facade.dto.res;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class GeResDto {
    private String id;

    private String v;

    private Integer v1;

    private Object v2;

    private Long v3;

    private BigDecimal v4;

    private Short v5;

    private String v6;

    private LocalDateTime createTime;

    private LocalDateTime modifyTime;
}
