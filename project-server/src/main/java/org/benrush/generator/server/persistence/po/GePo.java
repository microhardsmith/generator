package org.benrush.generator.server.persistence.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.benrush.generator.server.common.orm.BasePo;

import java.math.BigDecimal;


@TableName("pre_ge")
@Data
@EqualsAndHashCode(callSuper = true)
public class GePo extends BasePo {
    /**
     * 值域
     */
    private String v;

    private Integer v1;

    @TableField(value = "v2",typeHandler = org.benrush.generator.server.common.typehandler.JsonbHandler.class)
    private Object v2;

    private Long v3;

    private BigDecimal v4;

    private Short v5;

    private String v6;
}
