package com.wx.antlr.calculator;

import com.wx.antlr.calculator.automatic.CalculatorLexer;
import com.wx.antlr.calculator.automatic.CalculatorParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * @author xinquan.huangxq
 */
public class Calculator {

    public static int calc(String expression) {
        CalculatorLexer lexer = new CalculatorLexer(CharStreams.fromString(expression));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CalculatorParser parser = new CalculatorParser(tokens);
        ParseTree tree = parser.prog();
        EvalCalculatorVisitor eval = new EvalCalculatorVisitor();
        return eval.visit(tree);
    }
}
