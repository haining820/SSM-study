import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.haining820.pojo.User;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyTest {
    @Test
    public void testFastJSON() {
        List<User> list = new ArrayList<>();
        User user1 = new User("yuhaiyang1", 11, "男");
        User user2 = new User("yuhaiyang2", 22, "男");
        User user3 = new User("yuhaiyang3", 33, "男");
        list.add(user1);
        list.add(user2);
        list.add(user3);

        String strList = JSON.toJSONString(list);
        System.out.println("JSON.toJSONString(list)==>" + strList); // 包含Java对象的集合类转换成JSON字符串

        JSONArray jsonArray = (JSONArray) JSON.toJSON(list);
        System.out.println(jsonArray);          // 包含Java对象的集合类转换成JSONObject

        String str = JSON.toJSONString(user1);
        System.out.println("JSON.toJSONString(user1)==>" + str);    // Java对象转JSON字符串

        User jp_user1 = JSON.parseObject(str, User.class);
        System.out.println("JSON.parseObject(str,User.class)==>" + jp_user1);    // JSON字符串转Java对象

        JSONObject jsonObject = (JSONObject) JSON.toJSON(user2);
        System.out.println("(JSONObject) JSON.toJSON(user2)==>" + jsonObject.getString("name"));   // Java对象转JSON对象JSONObject，JSON对象的特点就是可以get到其中的属性

        User to_java_user = JSON.toJavaObject(jsonObject, User.class);
        System.out.println("JSON.toJavaObject(jsonObject1,User.class)==>" + to_java_user);  // JSON对象转Java对象
    }
}
