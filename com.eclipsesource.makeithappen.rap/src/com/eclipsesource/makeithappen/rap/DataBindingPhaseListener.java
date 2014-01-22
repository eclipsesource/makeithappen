package com.eclipsesource.makeithappen.rap;

import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.rap.rwt.RWT;
import org.eclipse.rap.rwt.lifecycle.PhaseEvent;
import org.eclipse.rap.rwt.lifecycle.PhaseId;
import org.eclipse.rap.rwt.lifecycle.PhaseListener;

@SuppressWarnings("serial")
public class DataBindingPhaseListener implements PhaseListener {

    @Override
    public PhaseId getPhaseId() {
        return PhaseId.PROCESS_ACTION;
    }

    @Override
    public void beforePhase(PhaseEvent event) {
        Realm realm = (Realm) RWT.getUISession().getAttribute("realm");
        RealmSetter.setRealm(realm);
    }

    @Override
    public void afterPhase(PhaseEvent event) {
        RealmSetter.setRealm(null);
    }
}