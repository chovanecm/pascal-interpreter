package cz.rank.pj.pascal;

/**
 * User: karl
 * Date: Feb 1, 2006
 * Time: 1:26:23 AM
 */
public abstract class Variable implements Expression {
	Object value;
	String name;

	abstract String getString();

    abstract void setString(String value);

    public Expression evaluate() {
        return this;
	}

	public abstract Integer getInteger();

	abstract void setInteger(Integer value);

    abstract Double getReal();

	abstract void setReal(Double value);

	public String getName() {
		return name;
	}

	public void setName(String id) {
		this.name = id;
	}

	public boolean equals(Object object) {
		return (object instanceof Variable) &&
				((Variable) object).getName().matches(getName());
	}

	public int hashCode() {
		return name.hashCode();
	}

	public Object getValue() {
		return value;
	}

    public void setValue(Object value) {
        this.value = value;
    }
}
