package com.upsight.android.managedvariables.internal;

import com.upsight.android.UpsightContext;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class BaseManagedVariablesModule_ProvideUpsightContextFactory implements Factory<UpsightContext> {
    static final /* synthetic */ boolean $assertionsDisabled = (!BaseManagedVariablesModule_ProvideUpsightContextFactory.class.desiredAssertionStatus());
    private final BaseManagedVariablesModule module;

    public BaseManagedVariablesModule_ProvideUpsightContextFactory(BaseManagedVariablesModule module) {
        if ($assertionsDisabled || module != null) {
            this.module = module;
            return;
        }
        throw new AssertionError();
    }

    public UpsightContext get() {
        return (UpsightContext) Preconditions.checkNotNull(this.module.provideUpsightContext(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static Factory<UpsightContext> create(BaseManagedVariablesModule module) {
        return new BaseManagedVariablesModule_ProvideUpsightContextFactory(module);
    }
}
