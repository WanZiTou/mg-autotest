package mg.cases;

import mg.listeners.TestngListener;
import main.java.mg.utils.HttpUtil;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 * @description:
 * @Author: mm.liu
 * @Date: 2019/10/30 11:17 下午
 */
@Listeners(TestngListener.class)
public class SspServerBid {

    String strJson="";

    @BeforeTest
    public void init(){
        strJson="{\n" +
                "    \"api_version\": \"2.2\",\n" +
                "    \"pos\": {\n" +
                "        \"ad_count\": 1,\n" +
                "        \"need_rendered_ad\": false,\n" +
                "        \"id\": \"4CB0F0E03B30\"\n" +
                "    },\n" +
                "    \"network\": {\n" +
                "        \"connect_type\": 1,\n" +
                "        \"carrier\": 0\n" +
                "    },\n" +
                "    \"device\": {\n" +
                "        \"screen_width\": 1080,\n" +
                "        \"device_type\": 1,\n" +
                "        \"model\": \"Redmi 4A\",\n" +
                "        \"screen_height\": 1920,\n" +
                "        \"android_id\": \"3b469b8b3cff6da3\",\n" +
                "        \"os\": \"android\",\n" +
                "        \"androidid_md5\": \"1082406a59aa577f2ec9f8f581ad477c\",\n" +
                "        \"mac\": \"d8:63:75:ac:a4:bd\",\n" +
                "        \"imei\": \"868795045424732\",\n" +
                "        \"os_version\": \"6.0.1\",\n" +
                "        \"manufacturer\": \"XIAOMI\",\n" +
                "        \"ua\": \"Mozilla/5.0 (Linux; Android 6.0.1; M5 Note Build /MMB29M; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/63.0.3239.111 Mobile Safari/537.36\"\n" +
                "    },\n" +
                "    \"geo\": {\n" +
                "        \"lng\": 119149963,\n" +
                "        \"lat\": 34746671\n" +
                "    },\n" +
                "    \"media\": {\n" +
                "        \"app_bundle_id\": \"com.ziqun.story\",\n" +
                "        \"app_version\": \"1.0.0\",\n" +
                "        \"app_id\": \"64EAE620E0B0\"\n" +
                "    }\n" +
                "}";
    }

    @Test
    public void testBid(){
        String url="http://ss.test.myhayo.com/adx?isDebug=true";
        String json= HttpUtil.qadPost(url,strJson);
        Assert.assertEquals(json,json);

    }

    @AfterTest
    public void end(){

    }
}
