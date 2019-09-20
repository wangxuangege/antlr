package com.wx.antlr.sample;

import com.wx.antlr.sample.automatic.RowsLexer;
import com.wx.antlr.sample.automatic.RowsParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

/**
 * @author xinquan.huangxq
 */
public class Col {

    public static void main(String[] args) {
        String lines = "parrt\tTerence parrt\t101\n" +
                "tombu\tTom Burns\t020\n" +
                "bke\tKevin Edgar\t008\n";

        RowsLexer lexer = new RowsLexer(CharStreams.fromString(lines));
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        RowsParser parser = new RowsParser(tokens, 1);
        parser.setBuildParseTree(false);
        parser.file();
    }
}
