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


/**
 * @since Available in iOS 5.1 and later.
 */
@Library("UIKit/UIKit.h") @Mapping("UIDictationPhrase")
public class UIDictationPhrase 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public UIDictationPhrase() { }

    
    @Mapping("text")
    public native String getText();
    @Mapping("alternativeInterpretations")
    public native List<String> getAlternativeInterpretations();

    
    


}
