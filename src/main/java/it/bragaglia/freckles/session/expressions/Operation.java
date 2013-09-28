/**
 * 
 */
package it.bragaglia.freckles.session.expressions;

import it.bragaglia.freckles.session.Expression;
import it.bragaglia.freckles.session.Value;

/**
 * @author stefano
 * 
 */
public interface Operation extends Expression {

	/**
	 * @param val1
	 * @param val2
	 * @return
	 */
	public Value evaluate(Value val1, Value val2);

}
