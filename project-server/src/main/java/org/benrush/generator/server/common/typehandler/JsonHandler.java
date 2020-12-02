package org.benrush.generator.server.common.typehandler;

import cn.hutool.json.JSONUtil;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedTypes;
import org.postgresql.util.PGobject;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @Description: @TableField(typeHandler = JsonHandler.class)可实现数据库存储json到java的Object的转化
 * @author: 刘希晨
 * @date: 2020/11/3 17:34
 */
@MappedTypes({Object.class})
public class JsonHandler extends BaseTypeHandler<Object> {
    private static String pgJdbcType = "json";

    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, Object o, JdbcType jdbcType) throws SQLException {
        PGobject jsonObject = new PGobject();
        jsonObject.setType(pgJdbcType);
        jsonObject.setValue(JSONUtil.toJsonStr(o));
        preparedStatement.setObject(i, jsonObject);
    }

    @Override
    public Object getNullableResult(ResultSet resultSet, String s) throws SQLException {
        if (null != resultSet.getString(s)) {
            return JSONUtil.toBean(resultSet.getString(s), Object.class);
        }
        return null;

    }

    @Override
    public Object getNullableResult(ResultSet resultSet, int i) throws SQLException {
        if (null != resultSet.getString(i)) {
            return JSONUtil.toBean(resultSet.getString(i), Object.class);
        }
        return null;

    }

    @Override
    public Object getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        if (null != callableStatement.getString(i)) {
            return JSONUtil.toBean(callableStatement.getString(i), Object.class);
        }
        return null;
    }
}
