package apple.audiotoolbox;


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
import apple.opengles.*;
import apple.coreaudio.*;
import apple.coremedia.*;


/*<javadoc>*/
/*</javadoc>*/
@Library("AudioToolbox")
public class AudioSession 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalFunction("AudioSessionInitialize")
    public static native int initialize(CFRunLoop inRunLoop, CFString inRunLoopMode, FunctionPtr inInterruptionListener, Todo inClientData);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalFunction("AudioSessionSetActive")
    public static native int setActive(boolean active);
    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalFunction("AudioSessionSetActiveWithFlags")
    public static native int setActiveWithFlags(boolean active, int inFlags);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalFunction("AudioSessionGetProperty")
    public static native int getProperty(int inID, Todo ioDataSize, Todo outData);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalFunction("AudioSessionSetProperty")
    public static native int setProperty(int inID, int inDataSize, Todo inData);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalFunction("AudioSessionGetPropertySize")
    public static native int getPropertySize(int inID, Todo outDataSize);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalFunction("AudioSessionAddPropertyListener")
    public static native int addPropertyListener(int inID, FunctionPtr inProc, Todo inClientData);
    /**
     * @since Available in iOS 2.1 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalFunction("AudioSessionRemovePropertyListenerWithUserData")
    public static native int removePropertyListenerWithUserData(int inID, FunctionPtr inProc, Todo inClientData);
    
}
