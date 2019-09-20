package com.wx.antlr.jsonparser;

/**
 * @author xinquan.huangxq
 */
public class IntNode extends JsonNode {

    private int value;

    public IntNode() {
    }

    public IntNode(int value) {
        this.value = value;
    }

    @Override
    public boolean isInt() {
        return true;
    }

    @Override
    public NodeType getNodeType() {
        return NodeType.INT;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }
}
