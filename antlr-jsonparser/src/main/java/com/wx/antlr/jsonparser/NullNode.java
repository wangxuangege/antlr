package com.wx.antlr.jsonparser;

/**
 * @author xinquan.huangxq
 */
public class NullNode  extends JsonNode {

    public NullNode() {
    }

    @Override
    public boolean isNull() {
        return true;
    }

    @Override
    public NodeType getNodeType() {
        return NodeType.NULL;
    }

    @Override
    public String toString() {
        return "null";
    }
}
