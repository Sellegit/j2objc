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
public abstract class UICollisionBehaviorDelegateAdapter 
    extends Object 
    implements UICollisionBehaviorDelegate {

    
    
    
    
    
    
    
    @NotImplemented("collisionBehavior:beganContactForItem:withItem:atPoint:")
    public void beganContact(UICollisionBehavior behavior, UIDynamicItem item1, UIDynamicItem item2, CGPoint p) { throw new UnsupportedOperationException(); }
    @NotImplemented("collisionBehavior:endedContactForItem:withItem:")
    public void endedContact(UICollisionBehavior behavior, UIDynamicItem item1, UIDynamicItem item2) { throw new UnsupportedOperationException(); }
    @NotImplemented("collisionBehavior:beganContactForItem:withBoundaryIdentifier:atPoint:")
    public void beganBoundaryContact(UICollisionBehavior behavior, UIDynamicItem item, Cloneable identifier, CGPoint p) { throw new UnsupportedOperationException(); }
    @NotImplemented("collisionBehavior:endedContactForItem:withBoundaryIdentifier:")
    public void endedBoundaryContact(UICollisionBehavior behavior, UIDynamicItem item, Cloneable identifier) { throw new UnsupportedOperationException(); }
    
}
