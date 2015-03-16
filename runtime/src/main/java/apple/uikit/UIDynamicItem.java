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





@Library("UIKit/UIKit.h") @Mapping("UIDynamicItem")
public interface UIDynamicItem 
    extends NSObjectProtocol {

    
    
    @Mapping("center")
    CGPoint getCenter();
    @Mapping("setCenter:")
    void setCenter(CGPoint v);
    @Mapping("bounds")
    CGRect getBounds();
    @Mapping("transform")
    CGAffineTransform getTransform();
    @Mapping("setTransform:")
    void setTransform(CGAffineTransform v);
    
    
    
    
    /*<adapter>*/
    /*</adapter>*/
}
