package cz.rank.pj.pascal;

import cz.rank.pj.pascal.operator.NotUsableOperatorException;

import java.util.List;

/**
 * User: karl
 * Date: Feb 23, 2006
 * Time: 10:45:39 PM
 */
public class WriteProcedure extends Procedure {
	public Object clone() throws CloneNotSupportedException {
		return new WriteProcedure();
	}

    @Override
    public void setParameters(List<Expression> parameters) throws NotEnoughtParametersException {
        if (parameters == null) {
			throw new NotEnoughtParametersException("Calling 'write' without parameter has no sence!");
		}

		super.setParameters(parameters);	//To change body of overridden methods use File | Settings | File Templates.
	}

    @Override
    public void execute() throws UnknowExpressionTypeException, NotUsableOperatorException {
        for (Expression ex : parameters) {
            System.out.println(ex);
        }
    }
}
