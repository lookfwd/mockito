package org.mockito.release.steps;

import org.mockito.release.util.operations.Operation;

public interface ReleaseStep extends Operation {

  String getDescription();

  void performRollback();

  /**
   * may return null. TODO: I don't like this
   */
  Operation getCleanup();
}
