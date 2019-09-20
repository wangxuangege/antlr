package com.wx.antlr.jsonparser;

import com.wx.antlr.jsonparser.automatic.JsonLexer;
import com.wx.antlr.jsonparser.automatic.JsonParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * @author xinquan.huangxq
 */
public class JsonParserUtil {

    /**
     * 解析json字符串
     *
     * @param jsonStr
     * @return
     */
    public static JsonNode parseJsonObject(String jsonStr) {
        JsonLexer lexer = new JsonLexer(CharStreams.fromString(jsonStr));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JsonParser parser = new JsonParser(tokens);
        ParseTree tree = parser.json();
        return new JsonParserVisitor().visit(tree);
    }
}
