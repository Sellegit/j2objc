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





@Library("UIKit/UIKit.h") @Mapping("UINibLoadingAdditions")
public interface UINibLoadingAdditions 
     {

    
    
    
    
    
    @Mapping("awakeFromNib")
    void awakeFromNib();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("prepareForInterfaceBuilder")
    void prepareForInterfaceBuilder();
    
    /*<adapter>*/
    /*</adapter>*/
}
