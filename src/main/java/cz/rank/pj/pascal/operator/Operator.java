package cz.rank.pj.pascal.operator;

import cz.rank.pj.pascal.Expression;
import cz.rank.pj.pascal.UnknownExpressionTypeException;
import org.apache.log4j.Logger;

/**
 * User: karl
 * Date: Feb 23, 2006
 * Time: 12:26:52 AM
 */
public abstract class Operator implements Expression {
    private static Logger logger;

    static {
        logger = Logger.getLogger(Operator.class);
    }

	protected Expression right;
	protected Expression left;

	public Operator(Expression left, Expression right) {
		setLeft(left);
		setRight(right);
	}

	abstract Object operate(Integer i1, Integer i2) throws NotUsableOperatorException;

	abstract Object operate(Double i1, Double i2) throws NotUsableOperatorException;

	abstract Object operate(String i1, String i2) throws NotUsableOperatorException;

	abstract Object operate(Boolean b1, Boolean b2) throws NotUsableOperatorException;

	public Object getValue() throws UnknownExpressionTypeException, NotUsableOperatorException {
		logger.debug(left + "|" + right);

		if (left.getValue() instanceof Integer) {
			return operate((Integer) left.getValue(), (Integer) right.getValue());
		}

		if (left.getValue() instanceof Double) {
			return operate((Double) left.getValue(), (Double) right.getValue());
		}

		if (left.getValue() instanceof String) {
			return operate((String) left.getValue(), (String) right.getValue());
		}

		if (left.getValue() instanceof Boolean) {
			return operate((Boolean) left.getValue(), (Boolean) right.getValue());
		}

		throw new UnknownExpressionTypeException(right.getValue().getClass().getCanonicalName());
	}

	public Expression getRight() {
		return right;
	}

	public void setRight(Expression right) {
		this.right = right;
	}

	public Expression getLeft() {
		return left;
	}

	public void setLeft(Expression left) {
		this.left = left;
	}

    public Expression evaluate() {
        return this;
	}
}
