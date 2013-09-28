/**
 * 
 */
package it.bragaglia.freckles.session;

import it.bragaglia.freckles.model.Context;

import java.util.Map;

/**
 * @author stefano
 * 
 */
public class JavaType implements Type {

	/**
	 * Invariant check against the internal state.
	 * 
	 * @return <code>true</code> if this instance's state is consistent,
	 *         <code>false</code> otherwise
	 */
	private boolean invariant() {
		return (true);
	}

	@Override
	public Session createSession(Map<String, Map<String, Context>> statements) {
		if (statements == null)
			throw new IllegalArgumentException(
					"Illegal 'statements' argument in JavaType.createSession(Map<String, Map<String, Context>>): "
							+ statements);
		Session result = null;
		Session session = new SessionImpl();
		for (String event : statements.keySet()) {
			// TODO Auto-generated method stub
			// Event e = session.getEvent(event);
		}
		assert invariant() : "Illegal state in JavaType.createSession(Map<String, Map<String, Context>>)";
		return result;
	}

}
