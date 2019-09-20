package com.wx.antlr.jsonparser;

/**
 * @author xinquan.huangxq
 */
public class JsonNodeFactory {

    public ObjectNode objectNode() {
        return new ObjectNode();
    }

    public ArrayNode arrayNode() {
        return new ArrayNode();
    }

    public JsonNode stringNode(String text) {
        return new StringNode(text);
    }

    public JsonNode intNode(int value) {
        return new IntNode(value);
    }

    public JsonNode doubleNode(double value) {
        return new DoubleNode(value);
    }

    public JsonNode boolNode(boolean b) {
        return new BoolNode(b);
    }

    public JsonNode nullNode() {
        return new NullNode();
    }
}
