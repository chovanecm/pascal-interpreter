package cz.rank.pj.pascal;

/**
 * User: karl
 * Date: Feb 23, 2006
 * Time: 12:39:03 AM
 */
public class UnknownExpressionTypeException extends Exception {
    public UnknownExpressionTypeException(String canonicalName) {
        super("Unknow expression type:" + canonicalName);
	}
}
