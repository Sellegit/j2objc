package apple.uikit;


import java.io.*;
import java.nio.*;
import java.util.*;
import com.google.j2objc.annotations.*;
import com.google.j2objc.runtime.*;
import com.google.j2objc.runtime.block.*;
import apple.audiotoolbox.*;
import apple.corefoundation.*;
import apple.coregraphics.*;
import apple.coreservices.*;
import apple.foundation.*;
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coreimage.*;
import apple.coretext.*;
import apple.corelocation.*;

/*<javadoc>*/
/*</javadoc>*/
@Adapter
public abstract class UIDynamicAnimatorDelegateAdapter 
    extends Object 
    implements UIDynamicAnimatorDelegate {

    
    
    


    
    
    @NotImplemented("dynamicAnimatorWillResume:")
    public void willResume(UIDynamicAnimator animator) { throw new UnsupportedOperationException(); }
    @NotImplemented("dynamicAnimatorDidPause:")
    public void didPause(UIDynamicAnimator animator) { throw new UnsupportedOperationException(); }

}
