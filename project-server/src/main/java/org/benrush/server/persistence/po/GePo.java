package org.benrush.server.persistence.po;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.benrush.server.common.orm.BasePo;


@TableName("ge")
@Data
@EqualsAndHashCode(callSuper = true)
public class GePo extends BasePo {
    private String v;
}
