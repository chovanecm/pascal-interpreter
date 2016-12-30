package cz.rank.pj.pascal.statement;

import cz.rank.pj.pascal.UnknowExpressionTypeException;
import cz.rank.pj.pascal.operator.NotUsableOperatorException;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * User: karl Date: Feb 22, 2006 Time: 4:09:13 PM
 */
public class Block implements Statement {

    private static Logger logger;

    static {
        logger = Logger.getLogger(Block.class);
    }

    List<Statement> statements;

    public Block() {
        statements = new ArrayList<Statement>();
    }

    public void execute() throws UnknowExpressionTypeException, NotUsableOperatorException {

        for (Statement st : statements) {
            logger.debug(st);
            st.execute();
            logger.debug(st);

        }
    }

    public String toString() {
        StringBuilder info = new StringBuilder("Block[");

        for (Statement st : statements) {
            info.append(st);
        }

        return info.append("]").toString();
    }

    public void add(Statement st) {
        statements.add(st);
    }
}
