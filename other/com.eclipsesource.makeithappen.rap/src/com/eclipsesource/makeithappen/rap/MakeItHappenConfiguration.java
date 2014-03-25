package com.eclipsesource.makeithappen.rap;

import org.eclipse.rap.rwt.application.Application;
import org.eclipse.rap.rwt.application.ApplicationConfiguration;

public class MakeItHappenConfiguration implements ApplicationConfiguration {

	  public void configure( Application application ) {
		  application.addPhaseListener(new DataBindingPhaseListener());
	    application.addEntryPoint( "/mih_user", MakeItHappenUserEntryPoint.class, null );
	  }

}
