/**
 * generated by Xtext 2.12.0-SNAPSHOT
 */
package org.projektas;

import org.projektas.MMKStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class MMKStandaloneSetup extends MMKStandaloneSetupGenerated {
  public static void doSetup() {
    new MMKStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}