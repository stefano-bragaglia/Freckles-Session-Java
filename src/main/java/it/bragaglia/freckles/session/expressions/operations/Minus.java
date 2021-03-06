/**
 * 
 */
package it.bragaglia.freckles.session.expressions.operations;

import it.bragaglia.freckles.session.Expression;
import it.bragaglia.freckles.session.Value;
import it.bragaglia.freckles.session.expressions.Operation;
import it.bragaglia.freckles.session.expressions.OperationImpl;

/**
 * @author stefano
 * 
 */
public class Minus extends OperationImpl implements Operation {

	/**
	 * @param expr1
	 * @param expr2
	 */
	public Minus(Expression expr1, Expression expr2) {
		super(expr1, expr2);
		assert invariant() : "Illegal state in Minus(Expression, Expression)";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * it.bragaglia.freckles.session.expressions.Operation#evaluate(it.bragaglia
	 * .freckles.model.Value, it.bragaglia.freckles.model.Value)
	 */
	@Override
	public Value evaluate(Value val1, Value val2) {
		Value result = val1.subtract(val2);
		assert invariant() : "Illegal state in Minus.evaluate(Expression, Expression)";
		return result;
	}

	/**
	 * Invariant check against the internal state.
	 * 
	 * @return <code>true</code> if this instance's state is consistent,
	 *         <code>false</code> otherwise
	 */
	private boolean invariant() {
		return (true);
	}

}
