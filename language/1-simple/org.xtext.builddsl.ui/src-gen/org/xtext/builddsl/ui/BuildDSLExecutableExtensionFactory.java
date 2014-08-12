/*
 * generated by Xtext
 */
package org.xtext.builddsl.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import org.xtext.builddsl.ui.internal.BuildDSLActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class BuildDSLExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return BuildDSLActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return BuildDSLActivator.getInstance().getInjector(BuildDSLActivator.ORG_XTEXT_BUILDDSL_BUILDDSL);
	}
	
}
