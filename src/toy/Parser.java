package toy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;

import toy.ast.ASTree;
import toy.ast.ASTLeaf;
import toy.ast.ASTList;

public class Parser {
    protected static abstract class Element {
    }

    protected static class Tree extends Element {

    }

    protected static class OrTree extends Element {

    }

    protected static class Repeat extends Element {

    }

    protected static class Leaf extends Element {

    }

    protected static class Skip extends Leaf {

    }

    protected static class Expr extends Element {
    }

    protected static abstract class AToken extends Element {

    }

    protected static class IdToken extends AToken {

    }

    protected static class NumberToken extends AToken {

    }

    protected static class StringToken extends AToken {

    }

    public static class Precedence {
    }

    public static class Operators extends HashMap<String, Precedence> {

    }

    public static final String factoryName = "create";

    protected static abstract class Factory {
    }

    protected List<Element> elements;
    protected Factory factory;

    public Parser(Class<? extends ASTree> clazz) {
        reset(clazz);
    }

    protected Parser(Parser p) {
    }

    public ASTree parse(Lexer lexer) throws ParseException {
        return null;
    }

    protected boolean match(Lexer lexer) throws ParseException {
        return false;
    }

    public static Parser rule() {
        return null;
    }

    public static Parser rule(Class<? extends ASTree> clazz){
        return new Parser(clazz);
    }

    public Parser reset(){
        return null;
    }

    public Parser reset(Class<? extends ASTree> clazz){
        return null;
    }

    public Parser number(){
        return number(null);
    }

    public Parser number(Class<? extends ASTLeaf> clazz){
        return null;
    }

    public Parser identifier(HashSet<String> reserved){
        return identifier(null, reserved);
    }

    public Parser identifier(Class<? extends ASTLeaf> clazz, HashSet<String> reserved){
        return null;
    }

    public Parser string(){
        return string(null);
    }

    public Parser string(Class<? extends ASTLeaf> clazz){
        return null;
    }

    public Parser token(String... pat){
        return null;
    }

    public Parser sep(String... pat){
        return null;
    }

    public Parser ast(Parser p){
        return null;
    }

    public Parser or(Parser... p){
        return null;
    }

    public Parser maybe(Parser p){
        return null;
    }

    public Parser option(Parser p){
        return null;
    }

    public Parser repeat(Parser p){
        return null;
    }

    public Parser expression(Parser subexp, Operators operators){
        return null;
    }

    public Parser expression(Class<? extends ASTree> clazz, Parser subexp, Operators operators){
        return null;
    }

    public Parser insertChoice(Parser p){
        return null;
    }
}
