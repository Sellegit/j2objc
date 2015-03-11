package apple.coreanimation;


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
import apple.coreimage.*;
import apple.coretext.*;
import apple.opengles.*;
import apple.metal.*;


/*<javadoc>*/
/*</javadoc>*/
@Adapter
public abstract class CAAnimationDelegateAdapter 
    extends Object 
    implements CAAnimationDelegate {

    
    
    
    
    
    
    
    @NotImplemented("animationDidStart:")
    public void didStart(CAAnimation anim) { throw new UnsupportedOperationException(); }
    @NotImplemented("animationDidStop:finished:")
    public void didStop(CAAnimation anim, boolean flag) { throw new UnsupportedOperationException(); }
    
}
