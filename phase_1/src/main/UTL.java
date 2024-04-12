package main;

import org.antlr.v4.runtime.*;
import parsers.*;

import java.io.IOException;

public class UTL {
    public static void main(String[] args) throws IOException {
        // You need to finish the grammar first (UTL.g4)
        // then generate antlr recognizer and run the samples
        CharStream reader = CharStreams.fromFileName(args[0]);
        UTLLexer lexer = new UTLLexer(reader);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        UTLParser parser = new UTLParser(tokens);
        parser.program();
    }
}
