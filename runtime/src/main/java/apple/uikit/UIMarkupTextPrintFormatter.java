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
 * @since Available in iOS 4.2 and later.
 */
@Library("UIKit/UIKit.h") @Mapping("UIMarkupTextPrintFormatter")
public class UIMarkupTextPrintFormatter 
    extends UIPrintFormatter 
     {

    
    
    @Mapping("initWithMarkupText:")
    public UIMarkupTextPrintFormatter(String markupText) { }
    @Mapping("init")
    public UIMarkupTextPrintFormatter() { }

    
    @Mapping("markupText")
    public native String getMarkupText();
    @Mapping("setMarkupText:")
    public native void setMarkupText(String v);

    
    


}
