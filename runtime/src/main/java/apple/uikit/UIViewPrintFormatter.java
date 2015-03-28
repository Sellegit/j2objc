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
@Library("UIKit/UIKit.h") @Mapping("UIViewPrintFormatter")
public class UIViewPrintFormatter 
    extends UIPrintFormatter 
     {

    
    
    @Mapping("init")
    public UIViewPrintFormatter() { }

    
    @Mapping("view")
    public native UIView getView();

    
    


}
