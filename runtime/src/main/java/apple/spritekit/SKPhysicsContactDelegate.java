package apple.spritekit;


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
import apple.coreimage.*;
import apple.avfoundation.*;
import apple.glkit.*;
import apple.scenekit.*;





@Library("SpriteKit") @Mapping("SKPhysicsContactDelegate")
public interface SKPhysicsContactDelegate 
    extends NSObjectProtocol {

    
    
    
    
    
    @Mapping("didBeginContact:")
    void didBeginContact(SKPhysicsContact contact);
    @Mapping("didEndContact:")
    void didEndContact(SKPhysicsContact contact);
    
    /*<adapter>*/
    /*</adapter>*/
}
