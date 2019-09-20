package com.wx.antlr.jsonparser;

import com.wx.antlr.jsonparser.automatic.JsonBaseVisitor;
import com.wx.antlr.jsonparser.automatic.JsonParser;

/**
 * @author xinquan.huangxq
 */
public class JsonParserVisitor extends JsonBaseVisitor<JsonNode> {

    public JsonNode jsonNode;

    private JsonNodeFactory nodeFactory;

    public JsonParserVisitor() {
        jsonNode = null;
        nodeFactory = new JsonNodeFactory();
    }

    @Override
    public JsonNode visitJson(JsonParser.JsonContext ctx) {
        if (ctx.object() != null) {
            jsonNode = visit(ctx.object());
        } else if (ctx.array() != null) {
            jsonNode = visit(ctx.array());
        }
        return jsonNode;
    }

    @Override
    public JsonNode visitAnObject(JsonParser.AnObjectContext ctx) {
        ObjectNode objectNode = nodeFactory.objectNode();
        for (JsonParser.PairContext pairContext : ctx.pair()) {
            JsonNode value = visit(pairContext.value());
            objectNode.set(pairContext.STRING().getText(), value);
        }
        return objectNode;
    }

    @Override
    public JsonNode visitEmptyObject(JsonParser.EmptyObjectContext ctx) {
        return nodeFactory.objectNode();
    }

    @Override
    public JsonNode visitArrayOfValues(JsonParser.ArrayOfValuesContext ctx) {
        ArrayNode arrayNode = nodeFactory.arrayNode();
        for (JsonParser.ValueContext valueContext : ctx.value()) {
            JsonNode value = visit(valueContext);
            arrayNode.add(value);
        }
        return arrayNode;
    }

    @Override
    public JsonNode visitEmptyArray(JsonParser.EmptyArrayContext ctx) {
        return nodeFactory.arrayNode();
    }

    @Override
    public JsonNode visitPair(JsonParser.PairContext ctx) {
        return super.visitPair(ctx);
    }

    @Override
    public JsonNode visitString(JsonParser.StringContext ctx) {
        return nodeFactory.stringNode(ctx.getText());
    }

    @Override
    public JsonNode visitAtom(JsonParser.AtomContext ctx) {
        if (ctx.NUMBER() != null) {
            String text = ctx.NUMBER().getText();
            try {
                int value = Integer.parseInt(text);
                return nodeFactory.intNode(value);
            } catch (Exception ignored) {
            }
            double value = Double.parseDouble(ctx.NUMBER().getText());
            return nodeFactory.doubleNode(value);
        } else if (ctx.getText().equals("true")) {
            return nodeFactory.boolNode(true);
        } else if (ctx.getText().equals("false")) {
            return nodeFactory.boolNode(false);
        } else {
            return nodeFactory.nullNode();
        }
    }

    @Override
    public JsonNode visitObjectValue(JsonParser.ObjectValueContext ctx) {
        return super.visitObjectValue(ctx);
    }

    @Override
    public JsonNode visitArrayValue(JsonParser.ArrayValueContext ctx) {
        return super.visitArrayValue(ctx);
    }
}
