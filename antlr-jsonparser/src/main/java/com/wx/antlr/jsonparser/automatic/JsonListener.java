// Generated from D:/workspace/code/antlr/antlr-jsonparser/src/main/java/com/wx/antlr/jsonparser\Json.g4 by ANTLR 4.7.2
package com.wx.antlr.jsonparser.automatic;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JsonParser}.
 */
public interface JsonListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JsonParser#json}.
	 * @param ctx the parse tree
	 */
	void enterJson(JsonParser.JsonContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#json}.
	 * @param ctx the parse tree
	 */
	void exitJson(JsonParser.JsonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AnObject}
	 * labeled alternative in {@link JsonParser#object}.
	 * @param ctx the parse tree
	 */
	void enterAnObject(JsonParser.AnObjectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AnObject}
	 * labeled alternative in {@link JsonParser#object}.
	 * @param ctx the parse tree
	 */
	void exitAnObject(JsonParser.AnObjectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EmptyObject}
	 * labeled alternative in {@link JsonParser#object}.
	 * @param ctx the parse tree
	 */
	void enterEmptyObject(JsonParser.EmptyObjectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EmptyObject}
	 * labeled alternative in {@link JsonParser#object}.
	 * @param ctx the parse tree
	 */
	void exitEmptyObject(JsonParser.EmptyObjectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayOfValues}
	 * labeled alternative in {@link JsonParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArrayOfValues(JsonParser.ArrayOfValuesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayOfValues}
	 * labeled alternative in {@link JsonParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArrayOfValues(JsonParser.ArrayOfValuesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EmptyArray}
	 * labeled alternative in {@link JsonParser#array}.
	 * @param ctx the parse tree
	 */
	void enterEmptyArray(JsonParser.EmptyArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EmptyArray}
	 * labeled alternative in {@link JsonParser#array}.
	 * @param ctx the parse tree
	 */
	void exitEmptyArray(JsonParser.EmptyArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#pair}.
	 * @param ctx the parse tree
	 */
	void enterPair(JsonParser.PairContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#pair}.
	 * @param ctx the parse tree
	 */
	void exitPair(JsonParser.PairContext ctx);
	/**
	 * Enter a parse tree produced by the {@code String}
	 * labeled alternative in {@link JsonParser#value}.
	 * @param ctx the parse tree
	 */
	void enterString(JsonParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code String}
	 * labeled alternative in {@link JsonParser#value}.
	 * @param ctx the parse tree
	 */
	void exitString(JsonParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Atom}
	 * labeled alternative in {@link JsonParser#value}.
	 * @param ctx the parse tree
	 */
	void enterAtom(JsonParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Atom}
	 * labeled alternative in {@link JsonParser#value}.
	 * @param ctx the parse tree
	 */
	void exitAtom(JsonParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectValue}
	 * labeled alternative in {@link JsonParser#value}.
	 * @param ctx the parse tree
	 */
	void enterObjectValue(JsonParser.ObjectValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectValue}
	 * labeled alternative in {@link JsonParser#value}.
	 * @param ctx the parse tree
	 */
	void exitObjectValue(JsonParser.ObjectValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayValue}
	 * labeled alternative in {@link JsonParser#value}.
	 * @param ctx the parse tree
	 */
	void enterArrayValue(JsonParser.ArrayValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayValue}
	 * labeled alternative in {@link JsonParser#value}.
	 * @param ctx the parse tree
	 */
	void exitArrayValue(JsonParser.ArrayValueContext ctx);
}