package apple.corefoundation;


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
import apple.dispatch.*;
import apple.foundation.*;


/*<javadoc>*/
/*</javadoc>*/
@Library("CoreFoundation/CoreFoundation.h")
public class CFNotificationCenter 
    extends CFType 
     {

    
    
    protected CFNotificationCenter() {}
    
    
    
    
    @GlobalFunction("CFNotificationCenterGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    @GlobalFunction("CFNotificationCenterGetLocalCenter")
    public static native CFNotificationCenter getLocalCenter();
    @GlobalFunction("CFNotificationCenterGetDarwinNotifyCenter")
    public static native CFNotificationCenter getDarwinNotifyCenter();
    @GlobalFunction("CFNotificationCenterAddObserver")
    public static native void addObserver(CFNotificationCenter center, Todo observer, FunctionPtr callBack, String name, Todo object, CFNotificationSuspensionBehavior suspensionBehavior);
    @GlobalFunction("CFNotificationCenterRemoveObserver")
    public static native void removeObserver(CFNotificationCenter center, Todo observer, String name, Todo object);
    @GlobalFunction("CFNotificationCenterRemoveEveryObserver")
    public static native void removeEveryObserver(CFNotificationCenter center, Todo observer);
    @GlobalFunction("CFNotificationCenterPostNotification")
    public static native void postNotification(CFNotificationCenter center, String name, Todo object, CFDictionary userInfo, boolean deliverImmediately);
    @GlobalFunction("CFNotificationCenterPostNotificationWithOptions")
    public static native void postNotification(CFNotificationCenter center, String name, Todo object, CFDictionary userInfo, @MachineSizedUInt long options);
    
}
