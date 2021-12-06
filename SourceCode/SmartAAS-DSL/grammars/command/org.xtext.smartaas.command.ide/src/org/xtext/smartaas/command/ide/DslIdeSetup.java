/*
 * generated by Xtext 2.23.0
 */
package org.xtext.smartaas.command.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.smartaas.command.DslRuntimeModule;
import org.xtext.smartaas.command.DslStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class DslIdeSetup extends DslStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new DslRuntimeModule(), new DslIdeModule()));
	}
	
}