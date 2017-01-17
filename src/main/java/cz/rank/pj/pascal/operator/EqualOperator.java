package cz.rank.pj.pascal.operator;

import cz.rank.pj.pascal.BoolExpression;
import cz.rank.pj.pascal.Expression;
import cz.rank.pj.pascal.UnknownExpressionTypeException;

/**
 * User: karl
 * Date: Feb 23, 2006
 * Time: 2:24:02 PM
 */
public class EqualOperator extends Operator implements BoolExpression {
	public EqualOperator(Expression left, Expression right) {
		super(left, right);
	}

	Object operate(Integer i1, Integer i2) {
		return i1 == i2;
	}

	Object operate(Double i1, Double i2) {
		return i1 == i2;
	}

	Object operate(String i1, String i2) throws NotUsableOperatorException {
		return i1.compareTo(i2) == 0;
	}

	Object operate(Boolean b1, Boolean b2) throws NotUsableOperatorException {
		return b1 == b2;
	}


    public boolean isTrue() throws UnknownExpressionTypeException, NotUsableOperatorException {
        return (Boolean) getValue();
	}

    public boolean isFalse() throws UnknownExpressionTypeException, NotUsableOperatorException {
        return !((Boolean) getValue());
	}
}
