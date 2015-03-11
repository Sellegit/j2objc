package apple.scenekit;


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
import apple.uikit.*;
import apple.coreanimation.*;
import apple.dispatch.*;
import apple.glkit.*;
import apple.spritekit.*;
import apple.opengles.*;


/*<javadoc>*/
/*</javadoc>*/
@Adapter
public abstract class SCNActionableAdapter 
    extends Object 
    implements SCNActionable {

    
    
    
    
    
    
    
    @NotImplemented("runAction:")
    public void runAction(SCNAction action) { throw new UnsupportedOperationException(); }
    @NotImplemented("runAction:completionHandler:")
    public void runAction(SCNAction action, @Block Runnable block) { throw new UnsupportedOperationException(); }
    @NotImplemented("runAction:forKey:")
    public void runAction(SCNAction action, String key) { throw new UnsupportedOperationException(); }
    @NotImplemented("runAction:forKey:completionHandler:")
    public void runAction(SCNAction action, String key, @Block Runnable block) { throw new UnsupportedOperationException(); }
    @NotImplemented("hasActions")
    public boolean hasActions() { throw new UnsupportedOperationException(); }
    @NotImplemented("actionForKey:")
    public SCNAction getAction(String key) { throw new UnsupportedOperationException(); }
    @NotImplemented("removeActionForKey:")
    public void removeAction(String key) { throw new UnsupportedOperationException(); }
    @NotImplemented("removeAllActions")
    public void removeAllActions() { throw new UnsupportedOperationException(); }
    
}
