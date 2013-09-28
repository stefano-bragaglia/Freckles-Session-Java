/**
 * 
 */
package it.bragaglia.freckles.session;

import java.util.Hashtable;
import java.util.Map;

/**
 * @author stefano
 * 
 */
public class SessionImpl implements Session {

	private Map<String, Event> events;

	public SessionImpl() {
		this.events = new Hashtable<>();
		assert invariant() : "Illegal state in SessionImpl()";
	}

	public Event getEvent(String event) {
		if (event == null || (event = event.trim()).isEmpty())
			throw new IllegalArgumentException(
					"Illegal 'event' argument in SessionImpl(String): " + event);
		Event result = events.get(event);
		if (result == null) {
			result = new EventImpl();
			events.put(event, result);
		}
		assert invariant() : "Illegal state in SessionImpl.getEvent(String)";
		return result;
	}

	/**
	 * Invariant check against the internal state.
	 * 
	 * @return <code>true</code> if this instance's state is consistent,
	 *         <code>false</code> otherwise
	 */
	private boolean invariant() {
		return (events != null);
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

}
