package cz.rank.pj.pascal;

/**
 * User: karl
 * Date: Feb 1, 2006
 * Time: 2:14:09 AM
 */
public class RealVariable extends Variable {

	public RealVariable() {
		setReal(0.0);
		setName(null);
	}

	public RealVariable(String name) {
		setReal(0.0);
		setName(name);
	}

	public RealVariable(String name, Double value) {
		setReal(value);
		setName(name);
	}

	public String getString() {
		return null;
	}

    public void setString(String value) {
    }

	public Integer getInteger() {
		return null;
	}

    public void setInteger(Integer value) {
    }

	public Double getReal() {
		return (Double) value;
	}

	public void setReal(Double value) {
		this.value = value;
	}

    public Expression evaluate() {
        return null;
	}

	public Object getValue() {
		return null;
	}
}
