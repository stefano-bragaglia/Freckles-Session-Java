/**
 * 
 */
package it.bragaglia.freckles.session.collector;

import it.bragaglia.freckles.session.Event;
import it.bragaglia.freckles.session.Value;

import java.util.Map;

/**
 * @author stefano
 *
 */
public interface Narrative {

	void update(Event event, long time, Map<String, Value> parameters);

}
