package com.pinux.utils.fastjson;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.TypeReference;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * * ┏┓　　　┏┓
 * ┏┛┻━━━┛┻┓
 * ┃　　　　　　　┃
 * ┃　　　━　　　┃
 * ┃　┳┛　┗┳　┃
 * ┃　　　　　　　┃
 * ┃　　　┻　　　┃
 * ┃　　　　　　　┃
 * ┗━┓　　　┏━┛
 * 　　┃　　　┃神兽保佑
 * 　　┃　　　┃代码无BUG！
 * 　　┃　　　┗━━━┓
 * 　　┃　　　　　　　┣┓
 * 　　┃　　　　　　　┏┛
 * 　　┗┓┓┏━┳┓┏┛
 * 　　　┃┫┫　┃┫┫
 * 　　　┗┻┛　┗┻┛
 *
 * @ClassName FastJsonUtil
 * @Description TODO
 * @Author pinux
 * @Date 19-4-6 上午2:12
 * @Version 1.0
 */
public class FastJsonUtil {

    /**
     * json字符串转map集合
     *
     * @param jsonStr
     * @return
     */
    public static HashMap<String, String> json2Map(String jsonStr) {
        return JSON.parseObject(jsonStr, new HashMap<String, String>().getClass());
    }

    /**
     * map转json字符串
     *
     * @param map
     * @return
     */
    public static String map2Json(Map<String, String> map) {
        String jsonStr = JSON.toJSONString(map);
        return jsonStr;
    }

    /**
     * json字符串转换成对象
     *
     * @param jsonString
     * @param cls
     * @return
     */
    public static <T> T json2Bean(String jsonString, Class<T> cls) {
        T t = null;
        try {
            t = JSON.parseObject(jsonString, cls);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return t;
    }

    /**
     * 对象转换成json字符串
     *
     * @param obj
     * @return
     */
    public static String bean2Json(Object obj) {
        return JSON.toJSONString(obj);
    }

    /**
     * json字符串转换成List集合
     * (需要实体类)
     *
     * @param jsonString
     * @return
     */
    public static <T> List<T> json2List(String jsonString, Class cls) {
        List<T> list = null;
        try {
            list = JSON.parseArray(jsonString, cls);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    /**
     * json字符串转换成ArrayList集合
     * (需要实体类)
     *
     * @param jsonString
     * @return
     */
    public static <T> ArrayList<T> json2ArrayList(String jsonString, Class cls) {
        ArrayList<T> list = null;
        try {
            list = (ArrayList<T>) JSON.parseArray(jsonString, cls);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    /**
     * List集合转换成json字符串
     *
     * @param obj
     * @return
     */
    public static String list2Json(Object obj) {
        return JSONArray.toJSONString(obj, true);
    }

    /**
     * json转List
     * (不需要实体类)
     *
     * @param jsonStr
     * @return
     */
    public static JSONArray json2List(String jsonStr) {
        return JSON.parseArray(jsonStr);
    }

    /**
     * 功能描述：把JSON数据转换成较为复杂的List<Map<String, Object>>
     * @param jsonData JSON数据
     * @return List<Map<String, Object>>
     */
    public static List<Map<String, Object>> getJsonToListMap(String jsonData) {
        return JSON.parseObject(jsonData, new TypeReference<List<Map<String, Object>>>() {
        });
    }



    public static void main(String[] args) {
        try {
            Map map = FastJsonUtil.json2Map("{\n" +
                    "\t\"id\": \"1\",\n" +
                    "\t\"name\": \"小明\",\n" +
                    "\t\"age\": \"13\"\n" +
                    "}");
            System.out.println("json2Map:" + map);
            String json = FastJsonUtil.map2Json(map);
            System.out.println("map2Json:" + json);
            User user = FastJsonUtil.json2Bean("{\n" +
                    "\t\"id\": \"1\",\n" +
                    "\t\"name\": \"小明\",\n" +
                    "\t\"age\": \"13\"\n" +
                    "}", User.class);
            System.out.println("json2Bean:" + user);
            String jsonString = FastJsonUtil.bean2Json(user);
            System.out.println("bean2Json"+jsonString);
            List<User> userList =FastJsonUtil.json2List("[{\"id\": \"1\",\"name\": \"小明\",\"age\": \"13\"},{\"id\": \"1\",\"name\": \"小明\",\"age\": \"13\"}]",User.class);
            System.out.println("json2List:"+userList);
            List<User> list =FastJsonUtil.json2ArrayList("[{\"id\": \"1\",\"name\": \"小明\",\"age\": \"13\"},{\"id\": \"1\",\"name\": \"小明\",\"age\": \"13\"}]",User.class);
            System.out.println("json2ArrayList:"+list);
            String jsonList = FastJsonUtil.list2Json(userList);
            System.out.println("list2Json:"+jsonList);
            List jsonListToString = FastJsonUtil.json2List("[{\"id\": \"1\"},{\"name\": \"小明\"},{\"age\": \"13\"}]");
            System.out.println("jsonListToString:"+jsonListToString);
            List<Map<String, Object>> mapList = FastJsonUtil.getJsonToListMap("[{\"id\": \"1\"},{\"name\": \"小明\"},{\"age\": \"13\"}]");
            System.out.println("mapList:"+mapList);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}