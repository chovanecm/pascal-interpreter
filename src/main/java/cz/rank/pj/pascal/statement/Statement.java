package cz.rank.pj.pascal.statement;

import cz.rank.pj.pascal.UnknownExpressionTypeException;
import cz.rank.pj.pascal.operator.NotUsableOperatorException;

/**
 * User: karl
 * Date: Jan 18, 2006
 * Time: 11:13:48 PM
 */
public interface Statement {
    public void execute() throws UnknownExpressionTypeException, NotUsableOperatorException;
}
