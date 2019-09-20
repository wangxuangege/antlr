package com.wx.antlr.jsonparser;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xinquan.huangxq
 */
public class ArrayNode extends JsonNode {

    private final List<JsonNode> _children;

    public ArrayNode() {
        _children = new ArrayList<>();
    }

    @Override
    public boolean isArray() {
        return true;
    }

    @Override
    public NodeType getNodeType() {
        return NodeType.ARRAY;
    }

    public JsonNode get(int index) {
        return _children.get(index);
    }

    public void add(JsonNode value) {
        _children.add(value);
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder();
        buf.append('[');
        if (!_children.isEmpty()) {
            buf.append(_children.get(0));
        }
        for (int i = 1; i < _children.size(); i++) {
            buf.append(",").append(_children.get(i));
        }
        buf.append("]");
        return buf.toString();
    }
}
