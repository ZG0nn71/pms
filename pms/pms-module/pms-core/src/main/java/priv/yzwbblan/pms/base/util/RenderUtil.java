package priv.yzwbblan.pms.base.util;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;

import priv.yzwbblan.pms.base.exception.PmsException;
import priv.yzwbblan.pms.base.exception.PmsExceptionEnum;

/**
 * 渲染工具类
 *
 * @author stylefeng
 * @date 2017-08-25 14:13
 */
public class RenderUtil {

    /**
     * 渲染json对象
     */
    public static void renderJson(HttpServletResponse response, Object jsonObject) {
        try {
            response.setContentType("application/json");
            response.setCharacterEncoding("UTF-8");
            PrintWriter writer = response.getWriter();
            writer.write(JSON.toJSONString(jsonObject));
        } catch (IOException e) {
            throw new PmsException(PmsExceptionEnum.WRITE_ERROR);
        }
    }
}
