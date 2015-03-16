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


/*<javadoc>*/
/*</javadoc>*/
@Library("UIKit/UIKit.h")
public class UIWindowLevel 
    extends Object 
     {

    
    
    
    
    
    @GlobalConstant("UIWindowLevelNormal")
    protected static native @MachineSizedFloat double LevelNormal();
    @GlobalConstant("UIWindowLevelAlert")
    protected static native @MachineSizedFloat double LevelAlert();
    @GlobalConstant("UIWindowLevelStatusBar")
    protected static native @MachineSizedFloat double LevelStatusBar();
    
}
