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





@Library("UIKit") @Mapping("UICollisionBehaviorDelegate")
public interface UICollisionBehaviorDelegate 
    extends NSObjectProtocol {

    
    
    
    
    
    @Mapping("collisionBehavior:beganContactForItem:withItem:atPoint:")
    void beganContact(UICollisionBehavior behavior, UIDynamicItem item1, UIDynamicItem item2, CGPoint p);
    @Mapping("collisionBehavior:endedContactForItem:withItem:")
    void endedContact(UICollisionBehavior behavior, UIDynamicItem item1, UIDynamicItem item2);
    @Mapping("collisionBehavior:beganContactForItem:withBoundaryIdentifier:atPoint:")
    void beganBoundaryContact(UICollisionBehavior behavior, UIDynamicItem item, Cloneable identifier, CGPoint p);
    @Mapping("collisionBehavior:endedContactForItem:withBoundaryIdentifier:")
    void endedBoundaryContact(UICollisionBehavior behavior, UIDynamicItem item, Cloneable identifier);
    
    /*<adapter>*/
    /*</adapter>*/
}
