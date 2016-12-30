package cz.rank.pj.pascal;

import cz.rank.pj.pascal.operator.NotUsableOperatorException;
import cz.rank.pj.pascal.statement.Block;
import cz.rank.pj.pascal.statement.Statement;

import java.util.ArrayList;
import java.util.List;


/**
 * User: karl
 * Date: Feb 23, 2006
 * Time: 10:36:24 PM
 */
public abstract class Procedure implements Statement, Cloneable {
	Block procedureBlock;
    List<Expression> parameters;

    public Procedure() {
        parameters = new ArrayList<Expression>();
    }

    public List<Expression> getParameters() {
        return parameters;
	}

    public void setParameters(List<Expression> parameters) throws NotEnoughtParametersException {
        this.parameters = parameters;
	}

	public void execute() throws UnknowExpressionTypeException, NotUsableOperatorException {
		procedureBlock.execute();
	}

	abstract public Object clone() throws CloneNotSupportedException;
}
