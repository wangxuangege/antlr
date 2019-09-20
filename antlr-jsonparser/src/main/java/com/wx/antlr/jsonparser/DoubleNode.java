package com.wx.antlr.jsonparser;

/**
 * @author xinquan.huangxq
 */
public class DoubleNode extends JsonNode {

    private double value;

    public DoubleNode() {
    }

    public DoubleNode(double value) {
        this.value = value;
    }

    @Override
    public boolean isDouble() {
        return true;
    }

    @Override
    public NodeType getNodeType() {
        return NodeType.DOUBLE;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return Double.toString(value);
    }
}
