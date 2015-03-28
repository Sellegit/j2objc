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


@Library("QuartzCore/QuartzCore.h") @Mapping("CALayerDelegate")
public interface CALayerDelegate 
     {

    
    


    
    @Mapping("displayLayer:")
    void displayLayer(CALayer layer);
    @Mapping("drawLayer:inContext:")
    void drawLayer(CALayer layer, CGContext ctx);
    @Mapping("layoutSublayersOfLayer:")
    void layoutSublayers(CALayer layer);
    @Mapping("actionForLayer:forKey:")
    CAAction getAction(CALayer layer, String event);

    /*<adapter>*/
    /*</adapter>*/
}
