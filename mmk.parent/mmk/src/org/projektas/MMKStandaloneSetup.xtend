/*
 * generated by Xtext 2.12.0-SNAPSHOT
 */
package org.projektas


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class MMKStandaloneSetup extends MMKStandaloneSetupGenerated {

	def static void doSetup() {
		new MMKStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
