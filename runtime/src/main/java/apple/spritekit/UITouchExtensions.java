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

/*<javadoc>*/
/*</javadoc>*/
@Library("SpriteKit/SpriteKit.h") @Mapping("UITouch")
public final class UITouchExtensions 
    extends NSExtensions 
     {

    
    
    private UITouchExtensions() {}

    


    
    
    @ExtensionMapping("locationInNode:")
    public static native CGPoint getLocationInNode(UITouch thiz, SKNode node);
    @ExtensionMapping("previousLocationInNode:")
    public static native CGPoint getPreviousLocationInNode(UITouch thiz, SKNode node);

}
