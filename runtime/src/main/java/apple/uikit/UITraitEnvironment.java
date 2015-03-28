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


@Library("UIKit/UIKit.h") @Mapping("UITraitEnvironment")
public interface UITraitEnvironment 
    extends NSObjectProtocol {

    
    
    @Mapping("traitCollection")
    UITraitCollection getTraitCollection();

    
    @Mapping("traitCollectionDidChange:")
    void traitCollectionDidChange(UITraitCollection previousTraitCollection);

    /*<adapter>*/
    /*</adapter>*/
}
