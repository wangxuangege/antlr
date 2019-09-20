package com.wx.antlr.jsonparser;

/**
 * @author xinquan.huangxq
 */
public class BoolNode extends JsonNode {

    private boolean value;

    public BoolNode() {
    }

    public BoolNode(boolean value) {
        this.value = value;
    }

    @Override
    public boolean isBool() {
        return true;
    }

    @Override
    public NodeType getNodeType() {
        return NodeType.BOOL;
    }

    public boolean getValue() {
        return value;
    }

    public void setValue(boolean value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return Boolean.toString(value);
    }
}
