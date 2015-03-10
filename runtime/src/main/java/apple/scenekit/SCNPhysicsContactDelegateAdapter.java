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

public abstract class SCNPhysicsContactDelegateAdapter 
    extends Object 
    implements SCNPhysicsContactDelegate {

    
    
    
    
    
    
    
    @NotImplemented("physicsWorld:didBeginContact:")
    public void didBeginContact(SCNPhysicsWorld world, SCNPhysicsContact contact) { throw new UnsupportedOperationException(); }
    @NotImplemented("physicsWorld:didUpdateContact:")
    public void didUpdateContact(SCNPhysicsWorld world, SCNPhysicsContact contact) { throw new UnsupportedOperationException(); }
    @NotImplemented("physicsWorld:didEndContact:")
    public void didEndContact(SCNPhysicsWorld world, SCNPhysicsContact contact) { throw new UnsupportedOperationException(); }
    
}
