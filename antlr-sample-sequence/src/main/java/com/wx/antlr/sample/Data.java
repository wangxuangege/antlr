package com.wx.antlr.sample;

import com.wx.antlr.sample.automatic.DataLexer;
import com.wx.antlr.sample.automatic.DataParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * @author xinquan.huangxq
 */
public class Data {

    public static void main(String[] args) {
        DataLexer lexer = new DataLexer(CharStreams.fromString("2 9 10 3 1 2 3"));
        //lexer.removeErrorListeners();

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        DataParser parser = new DataParser(tokens);
        ParseTree tree = parser.file();

        System.out.println(tree.toStringTree(parser));
    }
}
