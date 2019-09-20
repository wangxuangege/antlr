package com.wx.antlr.jsonparser;

/**
 * @author xinquan.huangxq
 */
public class StringNode extends JsonNode {

    private String value;

    public StringNode() {
    }

    public StringNode(String value) {
        this.value = value;
    }

    @Override
    public boolean isString() {
        return true;
    }

    @Override
    public NodeType getNodeType() {
        return NodeType.STRING;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
