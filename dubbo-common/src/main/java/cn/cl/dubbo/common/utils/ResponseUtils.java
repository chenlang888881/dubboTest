package cn.cl.dubbo.common.utils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by chenlang on 2017/5/25.
 */
public class ResponseUtils {

    public static void responseJson(HttpServletRequest request, HttpServletResponse response, String jsonString){
        setJsonResponseHeader(response);

        try {
            PrintWriter out = response.getWriter();
            out.print(jsonString);
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void setJsonResponseHeader(HttpServletResponse response) {
        response.setCharacterEncoding("UTF-8");
        response.setHeader("Content-Type", "application/json;charset=UTF-8");
        response.setHeader("Pragma", "no-cache");
        response.setHeader("Cache-Control", "no-cache, no-store, max-age=0");
        response.setHeader("Expires", "1L");
    }
}
