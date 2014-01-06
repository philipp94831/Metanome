package de.uni_potsdam.hpi.metanome.algorithm_integration.algorithm_execution;

import de.uni_potsdam.hpi.metanome.algorithm_integration.Algorithm;

/**
 * @author Jakob Zwiener
 * 
 * Receives an {@link Algorithm}'s progress.
 */
public interface ProgressReceiver {

	/**
	 * Updates the {@link Algorithm}'s progress. Progress should be between 0 and 1.
	 * If the progress is invalid false is returned.
	 * 
	 * @param progress
	 * @return true iff the neww progress is valid.
	 */
	boolean updateProgress(float progress);
}
