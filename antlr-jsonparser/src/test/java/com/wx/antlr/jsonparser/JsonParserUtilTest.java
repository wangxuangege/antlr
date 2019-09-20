package com.wx.antlr.jsonparser;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author xinquan.huangxq
 */
public class JsonParserUtilTest {

    @Test
    public void parseJsonObject() {

        String jsonStr = "{\n" +
                "  \"a\": \"b\",\n" +
                "  \"c\": [1,2,3],\n" +
                "  \"d\": {\n" +
                "    \"name\": \"hxq\",\n" +
                "    \"age\": 30,\n" +
                "    \"email\": \"245817568@email.com\"\n" +
                "  },\n" +
                "  \"attrs\": [{\n" +
                "    \"key\": \"name\",\n" +
                "    \"type\": \"string\"\n" +
                "  }, {\n" +
                "    \"key\": \"age\",\n" +
                "    \"type\": \"int\"\n" +
                "  }, {\n" +
                "    \"key\": \"email\",\n" +
                "    \"type\": \"string\"\n" +
                "  }]\n" +
                "}\n";
        JsonNode jsonNode = JsonParserUtil.parseJsonObject(jsonStr);
        Assert.assertTrue(jsonNode.isObject());

        System.out.println(jsonNode);
    }
}