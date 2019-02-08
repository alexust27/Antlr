// Generated from /home/alex/IdeaProjects/MT3/src/main/antlr/FProgram.g4 by ANTLR 4.7.2
package main.java.parser;

import main.java.expression.*;
import main.java.expression.logical.*;
import main.java.expression.arithmetic.*;
import java.util.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FProgramParser}.
 */
public interface FProgramListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FProgramParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(FProgramParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link FProgramParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(FProgramParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link FProgramParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(FProgramParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link FProgramParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(FProgramParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link FProgramParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(FProgramParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link FProgramParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(FProgramParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link FProgramParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(FProgramParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link FProgramParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(FProgramParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link FProgramParser#add_sub}.
	 * @param ctx the parse tree
	 */
	void enterAdd_sub(FProgramParser.Add_subContext ctx);
	/**
	 * Exit a parse tree produced by {@link FProgramParser#add_sub}.
	 * @param ctx the parse tree
	 */
	void exitAdd_sub(FProgramParser.Add_subContext ctx);
	/**
	 * Enter a parse tree produced by {@link FProgramParser#mul_div}.
	 * @param ctx the parse tree
	 */
	void enterMul_div(FProgramParser.Mul_divContext ctx);
	/**
	 * Exit a parse tree produced by {@link FProgramParser#mul_div}.
	 * @param ctx the parse tree
	 */
	void exitMul_div(FProgramParser.Mul_divContext ctx);
	/**
	 * Enter a parse tree produced by {@link FProgramParser#unary_ar}.
	 * @param ctx the parse tree
	 */
	void enterUnary_ar(FProgramParser.Unary_arContext ctx);
	/**
	 * Exit a parse tree produced by {@link FProgramParser#unary_ar}.
	 * @param ctx the parse tree
	 */
	void exitUnary_ar(FProgramParser.Unary_arContext ctx);
	/**
	 * Enter a parse tree produced by {@link FProgramParser#or}.
	 * @param ctx the parse tree
	 */
	void enterOr(FProgramParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by {@link FProgramParser#or}.
	 * @param ctx the parse tree
	 */
	void exitOr(FProgramParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by {@link FProgramParser#and}.
	 * @param ctx the parse tree
	 */
	void enterAnd(FProgramParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by {@link FProgramParser#and}.
	 * @param ctx the parse tree
	 */
	void exitAnd(FProgramParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by {@link FProgramParser#unary_logic}.
	 * @param ctx the parse tree
	 */
	void enterUnary_logic(FProgramParser.Unary_logicContext ctx);
	/**
	 * Exit a parse tree produced by {@link FProgramParser#unary_logic}.
	 * @param ctx the parse tree
	 */
	void exitUnary_logic(FProgramParser.Unary_logicContext ctx);
	/**
	 * Enter a parse tree produced by {@link FProgramParser#cmp}.
	 * @param ctx the parse tree
	 */
	void enterCmp(FProgramParser.CmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link FProgramParser#cmp}.
	 * @param ctx the parse tree
	 */
	void exitCmp(FProgramParser.CmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link FProgramParser#cmp_op}.
	 * @param ctx the parse tree
	 */
	void enterCmp_op(FProgramParser.Cmp_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link FProgramParser#cmp_op}.
	 * @param ctx the parse tree
	 */
	void exitCmp_op(FProgramParser.Cmp_opContext ctx);
}