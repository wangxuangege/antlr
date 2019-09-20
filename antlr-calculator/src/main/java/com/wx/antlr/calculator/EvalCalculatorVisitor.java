package com.wx.antlr.calculator;

import com.wx.antlr.calculator.automatic.CalculatorBaseVisitor;
import com.wx.antlr.calculator.automatic.CalculatorParser;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xinquan.huangxq
 */
public class EvalCalculatorVisitor extends CalculatorBaseVisitor<Integer> {

    private Map<String, Integer> memory = new HashMap<String, Integer>();

    @Override
    public Integer visitAssign(CalculatorParser.AssignContext ctx) {
        String id = ctx.ID().getText();
        int value = visit(ctx.expr());
        memory.put(id, value);
        return value;
    }

    @Override
    public Integer visitPrintExpr(CalculatorParser.PrintExprContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public Integer visitInt(CalculatorParser.IntContext ctx) {
        return Integer.valueOf(ctx.INT().getText());
    }

    @Override
    public Integer visitParens(CalculatorParser.ParensContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public Integer visitId(CalculatorParser.IdContext ctx) {
        String id = ctx.ID().getText();
        if (memory.containsKey(id)) return memory.get(id);
        return 0;
    }

    @Override
    public Integer visitMulDiv(CalculatorParser.MulDivContext ctx) {
        int left = visit(ctx.expr(0));
        int right = visit(ctx.expr(1));
        if (ctx.op.getType() == CalculatorParser.MUL) return left * right;
        return left / right;
    }

    @Override
    public Integer visitAddSub(CalculatorParser.AddSubContext ctx) {
        int left = visit(ctx.expr(0));
        int right = visit(ctx.expr(1));
        if (ctx.op.getType() == CalculatorParser.ADD) return left + right;
        return left - right;
    }
}
