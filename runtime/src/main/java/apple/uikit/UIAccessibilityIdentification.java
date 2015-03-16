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





@Library("UIKit/UIKit.h") @Mapping("UIAccessibilityIdentification")
public interface UIAccessibilityIdentification 
    extends NSObjectProtocol {

    
    
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("accessibilityIdentifier")
    String getAccessibilityIdentifier();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setAccessibilityIdentifier:")
    void setAccessibilityIdentifier(String v);
    
    
    
    
    /*<adapter>*/
    /*</adapter>*/
}
